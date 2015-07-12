package com.naughtyzombie.countdownlatch;

import java.util.concurrent.CountDownLatch;

class DatabaseService extends Thread {
    private final CountDownLatch latch;

    public DatabaseService(CountDownLatch latch){
        super("DatabaseService");
        this.latch = latch;
    }

    /**
     * JVM is starting a new thread, note how the box at the end of this arrow is brown in colour, this indicates 
     * that it is a different thread to the pink thread;
     */
    @Override
    public void run() {
        initialise();

        /* Decrements the CountDownLatch, which was initialised with 1, down to 0; this will cause the
           await call (msg: 5) to be released. */
        latch.countDown();
    }

    private void initialise() {
    }
}