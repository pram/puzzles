package com.naughtyzombie.ci.dataandstrings.stringreverse;

/**
 * Created by pram on 02/07/2015.
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String input = "This is a test string to reverse";
        String output = rs.reverseString1(input);
        char[] output2 = rs.reverseString2(input.toCharArray());
        System.out.println(output);
        System.out.println(output2);
    }

    private char[] reverseString2(char[] input) {
        for(int i = 0, j = input.length - 1; i < input.length / 2; i++, j--) {
            char c = input[i];
            input[i] = input[j];
            input[j] = c;
        }
        return input;
    }


    private String reverseString1(String input) {
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
