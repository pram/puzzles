package com.naughtyzombie.palindrometest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pram on 10/07/2015.
 */
public class PalindromeTestTest {

    @Test
    public void testIsPalindromeTrue() throws Exception {
        PalindromeTest pt = new PalindromeTest();
        assertEquals(true,pt.isPalindrome("abbabba"));
    }

    @Test
    public void testIsPalindromeFalse() throws Exception {
        PalindromeTest pt = new PalindromeTest();
        assertEquals(false,pt.isPalindrome("bdghdfgfdfd"));
    }

    @Test
    public void testIsPalindromeSingle() throws Exception {
        PalindromeTest pt = new PalindromeTest();
        assertEquals(false,pt.isPalindrome("a"));
    }
}