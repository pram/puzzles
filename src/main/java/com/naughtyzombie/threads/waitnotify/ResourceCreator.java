package com.naughtyzombie.threads.waitnotify;

public class ResourceCreator implements Runnable {
    private ResourceCarrier carrier;

    public ResourceCreator(ResourceCarrier carrier) {
        this.carrier = carrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (carrier) {
            carrier.resourceIsReady();
            carrier.notifyAll();
        }
    }
}
