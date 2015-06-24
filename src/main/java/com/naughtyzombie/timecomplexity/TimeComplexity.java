package com.naughtyzombie.timecomplexity;

/**
 * Created by pram on 23/06/2015.
 */
public class TimeComplexity {
    public static void main(String[] args) {
        TimeComplexity tc = new TimeComplexity();
        int input = 100000;
        tc.slow(input);
        tc.fast(input);
        tc.model(input);
    }

    private void slow(int input) {
        long startTime = System.currentTimeMillis();
        int result = 0;
        for (int i=1;i <= input;i++) {
            for (int j=1; j <= i; j++) {
                result++;
            }
        }
        System.out.println("Slow " + result);
        long endTime = System.currentTimeMillis();
        System.out.println("Slow total execution time: " + (endTime-startTime) + "ms");
    }

    private void fast(int input) {
        long startTime = System.currentTimeMillis();
        int result = 0;
        for (int i=0; i < input; i++) {
            result += (i+1);
        }
        System.out.println("Fast " + result);
        long endTime = System.currentTimeMillis();
        System.out.println("Fast total execution time: " + (endTime-startTime) + "ms");
    }

    private void model(int input) {
        long startTime = System.currentTimeMillis();
        int result = input * (input + 1) / 2;
        System.out.println("Model " + result);
        long endTime = System.currentTimeMillis();
        System.out.println("Model total execution time: " + (endTime-startTime) + "ms");
    }
}
