package com.naughtyzombie.fib;

/**
 * Created by pram on 22/06/2015.
 */
public class FibonnaciLoop {
    public static void main(String[] args) {
        int n = 25, first = 0, second = 1, next, i;
        System.out.println("Printing first " + n + " numbers in Fibonacci Series \n");
        calc(n, first, second);
    }

    private static void calc(int n, int first, int second) {
        int i;
        int next;
        for (i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + "\t");
        }
    }
    
    //This implementation works in all cases
    public int getFib(int nthNum) {
        int next = 0;
        int first = 0;
        int second = 1;

        if (nthNum < 2) {
            next = nthNum;
        } else {
            for (int i = 2; i <= nthNum; i++) {
                next = first + second;
                first = second;
                second = next;
            }
        }
        
        return next;
    }
}
