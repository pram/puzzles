package com.naughtyzombie.fizzbuzz;

/**
 * Created by Pram on 11/04/2015.
 *
 * Print the numbers from 1 to 100. If the number is divisible by 3 then print "Fizz", if the number is divisible by 5 then print "Buzz" and if the number is divisible by both 3 and 5 then print "FizzBuzz"
 */
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {
            String test="";
            test += (i % 3 == 0) ? "Fizz" : "";
            test += (i % 5 == 0) ? "Buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }

    }
}
