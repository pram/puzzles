package com.naughtyzombie.palindrometest;

/**
 * Created by pram on 09/07/2015.
 */
public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest pt = new PalindromeTest();
        boolean isPalindrome = pt.isPalindrome("aabbgagbbaa");
        System.out.println(isPalindrome);
    }

    private boolean isPalindrome(String testString) {
        if (testString.length() < 2)
            return false;

        char[] chars = testString.toCharArray();
        boolean retVal = true;
        for (int i = 0; i < chars.length/2; i++) {
            char left = chars[i];
            char right = chars[(chars.length - 1) - i];
            if (left != right) {
                retVal = false;
                break;
            }
        }
        return retVal;
    }
}
