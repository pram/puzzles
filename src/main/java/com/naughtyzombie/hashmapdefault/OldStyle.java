package com.naughtyzombie.hashmapdefault;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
* Provides access to Accounts.
*/
class OldStyle {
    private static Map<String, Account> oldAccounts = new ConcurrentHashMap<>();

    /**
     * The old way before computeIfAbsent: Take a look at the code, note the use of synchronized, this is used to 
     * avoid a race condition where two competing threads, could create the Account object twice.
     */
    public static Account oldStyle() {
        String accountId = "9876543210";
        synchronized(oldAccounts) {
            // First, attempt to retrieve the Account
            Account account = oldAccounts.get(accountId);
            if (account == null) {
                
                account = new Account(accountId);
                
                // The Account didn't exist, create a new account and put in map.
                oldAccounts.put(accountId, account);
            }
            return account;
        }
    }
}