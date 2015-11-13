package com.naughtyzombie.sorting.bubble;

/**
 * Created by pram on 24/06/2015.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1, 4, 6, 3};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(input);
    }

    private void bubbleSort(int[] input) {
        int n = input.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i=0; i < n -1; i++) {
                k = i + 1;
                if (input[i] > input[k]) {
                    swapNumbers(i,k,input);
                }
            }
            printNumbers(input);
        }
    }

    private void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int out = input[i];
            System.out.print(out + ", ");
        }
        System.out.print("\n");
    }

    private void swapNumbers(int i, int k, int[] input) {
        int temp;
        temp = input[i];
        input[i]  = input[k];
        input[k] = temp;
    }


}
