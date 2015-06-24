package com.naughtyzombie.sorting.selection;

/**
 * Created by pram on 24/06/2015.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1, 4, 6, 3};
        SelectionSort ss = new SelectionSort();
        int[] output = ss.selectionSort(input);
        for (int i : output) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int val = input[i];
            int index = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[index])
                    index = j;

                int smallerNumber = input[index];
                input[index] = input[i];
                input[i] = smallerNumber;
            }
        }

        return input;
    }
}
