package com.naughtyzombie.numbercounting;

import java.util.stream.IntStream;

/**
 * Created by pram on 24/06/2015.
 */
public class NumberCounting {

    public static void main(String[] args) {
        NumberCounting nc = new NumberCounting();
        int[] A = new int[] {1,2,3,4,5,6};
        int[] B = new int[] {2,3,4,5,6,7};

        int m = 1000000;

        System.out.println(nc.slowSolution(A, B, m));
    }

    private boolean slowSolution(int[] A, int[] B, int m) {
        int n = A.length;
        int sumA = IntStream.of(A).sum();
        int sumB = IntStream.of(B).sum();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int change = B[j] - A[i];
                sumA += change;
                sumB -= change;
                if (sumA == sumB)
                    return true;
                sumA -= change;
                sumB += change;
            }
        }

        return false;
    }

    private boolean fastSolution(int[] A, int[] B, int m) {
        int n = A.length;
        int sumA = IntStream.of(A).sum();
        int sumB = IntStream.of(B).sum();

        int d = sumB - sumA;

        if (d % 2 == 1)
            return false;

        d /= 2;



        return false;
    }
}
