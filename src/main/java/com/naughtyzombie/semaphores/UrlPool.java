package com.naughtyzombie.semaphores;

import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Semaphore;

public class UrlPool {
    private final Semaphore available;
    private final URL url;
    
    public UrlPool(URL url, int maximumConnections) {
        this.url = url;
        //Constructs the Semaphore with max number of permits, this will only allow x clients to concurrently access the server
        available = new Semaphore(maximumConnections, true);
    }

    public URLConnection openConnection() throws InterruptedException {
        //Acquires the available permit
        //If the available permits are taken, this call will block
        available.acquire();
        System.out.println("Acquire");
        try {
            return url.openConnection();
        } catch (Throwable t) {
            available.release();
            throw new RuntimeException(t);
        }
    }

    public void releaseConnection(URLConnection urlConnection) {
        //Releases a permit making a permit available, this will unblock the acquire call
        available.release();
        System.out.println("Release");
    }
}