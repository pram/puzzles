package com.naughtyzombie.ocp;

/**
 * Created by pram on 02/06/2015.
 */
public class PrintCheck {
    public static void main(String[] args) {
        boolean b = false;
        int i = 7;
        double d = 1.23;
        float f = 4.56f;

        System.out.printf(" %b", b);
        //System.out.printf(" %i", i);
        //System.out.format(" %d", d);
        System.out.format(" %d", i);
        System.out.format(" %f", f);
    }
}
