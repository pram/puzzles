package com.naughtyzombie.hashmapdefault;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Demos Map::computeIfAbsent.
 */
public class HashMapDefault {

    private static Map<String, Account> accounts = new ConcurrentHashMap<>();

    /**
     * Demonstrates Map::computeIfAbsent, new in Java 8; When retrieving a value from a map, which doesn't exist,
     * it is often desirable to create the default value, and make the new key-value available for future retrieval.
     */
    public static final void main(String argv[]) {
        
        String accountId = "0123456789";
        
        /* A function to create an Account is passed in as second argument, which is only invoked when the
           Key doesn't already exist. */
        Account account = accounts.computeIfAbsent(accountId, f -> {
            return new Account(accountId);
        });

        account = null;
        
        // Note on this call, a new Account object is not created, because the Key already exists in the Map, also note the exact same value is returned.
        account = accounts.computeIfAbsent(accountId, f -> {
            return new Account(accountId);
        });

        OldStyle.oldStyle();
    }
}