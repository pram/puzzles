package com.naughtyzombie.ci.uniquechar;

/**
 * Created by pram on 02/07/2015.
 */
public class UniqueChars {
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        UniqueChars uc = new UniqueChars();
        for (String input : words) {
            System.out.println(uc.isUniqueChars(input) + " - " + uc.isUniqueChars2(input));
        }
    }

    public boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public boolean isUniqueChars2(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

}
