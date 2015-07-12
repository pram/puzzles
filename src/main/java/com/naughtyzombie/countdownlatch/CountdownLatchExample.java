package com.naughtyzombie.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Demonstrates the use of a CountDownLatch; the DatabaseService must complete initialisation,
 * before the main CountDownLatchDemo1 can perform its own initialisation.
 */
public class CountdownLatchExample {

    /**
     * Demonstrates the use of a CountDownLatch; the DatabaseService must complete initialisation,
     * before the CountDownLatchDemo1 can perform its own initialisation.
     */
    public static void main(String args[]) throws Exception {
        // CountDownLatch is constructed with 1, as we are only waiting for 1 task to complete before continuing
        final CountDownLatch latch = new CountDownLatch(1);
        
        // The DatabaseService is passed the latch, so that the DatabaseService can reference it.
        DatabaseService databaseService = new DatabaseService(latch);

        databaseService.start();

        // Causes this thread to wait, until the DatabaseService completes initialisation and countDown the latch
        latch.await();

        initialise();
    }

    /**
     * msg: 5, is released (msg: 12), because of msg: 9; Now that the DatabaseService has completed initialisation,
     * this initialise can be performed.
     */
    public static void initialise() {
        System.out.println("Dependent services initialised, performing initialisation now");
    }
}