package com.naughtyzombie.semaphores;

import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Semaphore;

public class UrlPool {
    private final Semaphore available;
    private final URL url;
    
    public UrlPool(URL url, int maximumConnections) {
        this.url = url;
        available = new Semaphore(maximumConnections, true);
    }

    public URLConnection openConnection() throws InterruptedException {
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
        available.release();
        System.out.println("Release");
    }
}