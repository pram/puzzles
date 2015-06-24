package com.naughtyzombie.sorting.insertion;

/**
 * Created by pram on 24/06/2015.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1, 4, 6, 3};
        InsertionSort is = new InsertionSort();
        int[] output = is.insertionSort(input);
        for (int i : output) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private int[] insertionSort(int[] input) {
        int temp;
        for (int i=1; i < input.length; i++) {
            for (int j=i; j > 0; j--) {
                if (input[j] < input[j-1]) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
