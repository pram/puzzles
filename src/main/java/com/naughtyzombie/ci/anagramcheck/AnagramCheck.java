package com.naughtyzombie.ci.anagramcheck;

import java.util.Arrays;

/**
 * Created by pram on 02/07/2015.
 */
public class AnagramCheck {
    public static void main(String[] args) {
        AnagramCheck ac = new AnagramCheck();
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = ac.permutation(word1, word2);
            System.out.println("Word 1 " + word1 + " : Word 2 " + word2 + " : Anagram " + anagram);
        }
    }

    private boolean permutation(String word1, String word2) {
        return sort(word1).equals(sort(word2));
    }

    private String sort(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
