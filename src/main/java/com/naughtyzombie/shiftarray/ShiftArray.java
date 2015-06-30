package com.naughtyzombie.shiftarray;

/**
 * Created by pram on 30/06/2015.
 */
public class ShiftArray {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ShiftArray sa = new ShiftArray();
        int[] out = sa.shift(in, 3);

        for (int i : out) {
            System.out.println(i);
        }

    }

    private int[] shift(int[] in, int split) {
        int[] retVal = new int[in.length];
        System.arraycopy(in, split, retVal, 0, in.length - split);
        System.arraycopy(in, 0, retVal, in.length - split, split );
        return retVal;
    }
}
