package com.naughtyzombie.concurrency.semaphores;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ResourcePoolExample {
    static UrlPool urlPool;
    public static void main(String argv[]) throws MalformedURLException {
        urlPool = new UrlPool(new URL("http://google.com"), 2);
        performTask();
        performTask();
        performTask();
        performTask();
        performTask();
        performTask();
        performTask();
    }
    
    public static void performTask() {
        Thread t = new Thread(() -> {
            URLConnection connection = null;
            try {
                connection = urlPool.openConnection();
                doSomeWork(connection);
                Thread.sleep(2000);
            } catch (Throwable e) {
                e.printStackTrace();
            } finally {
                urlPool.releaseConnection(connection);
            }
        });
        t.start();
    }
    
    private static void doSomeWork(URLConnection connection) {
        System.out.println(connection.getHeaderFields());
    }
}