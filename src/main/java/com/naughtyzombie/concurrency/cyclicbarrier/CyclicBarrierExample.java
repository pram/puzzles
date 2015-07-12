package com.naughtyzombie.concurrency.cyclicbarrier;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*
Java.util.Concurrent.CyclicBarrier is a synchronisation aid that allows a set of threads to wait for each other to
reach a common barrier point. This means that all the threads reaching a specific point (called as barrier point)
will have to wait for other threads to reach the same point. As soon as all the threads have reached the barrier
point, all threads to are released to continue.
 */

public class CyclicBarrierExample {

    public static void main(String[] args) {

        //3 threads are part of the barrier, ServiceOne, ServiceTwo and this main thread calling them.
        final CyclicBarrier barrier = new CyclicBarrier(3);
        Thread serviceOneThread = new Thread(new ServiceOne(barrier));
        Thread serviceTwoThread = new Thread(new ServiceTwo(barrier));

        System.out.println("Starting both the services at" + new Date());

        serviceOneThread.start();
        serviceTwoThread.start();

        try {
            barrier.await();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted!");
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Main Thread interrupted!");
            e.printStackTrace();
        }
        System.out.println("Ending both the services at " + new Date());
    }


}
