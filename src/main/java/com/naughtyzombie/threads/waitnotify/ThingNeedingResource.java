package com.naughtyzombie.threads.waitnotify;

public class ThingNeedingResource implements Runnable {

    private ResourceCarrier carrier;

    public ThingNeedingResource(ResourceCarrier carrier) {

        this.carrier = carrier;
    }

    @Override
    public void run() {
        synchronized (carrier) {
            while (!carrier.isResourceReady()) {
                try {
                    System.out.println("Waiting for Resource");
                    carrier.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Resource obtained");
        }
    }
}
