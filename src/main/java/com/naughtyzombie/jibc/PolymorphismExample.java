package com.naughtyzombie.jibc;

/**
 * Created by pram on 10/06/2015.
 *
 * The ability to define or override a methods implementation in a subclass results in Polymorphism.
 * When executing a method the implementation used is not the one specified by the variable type but
 * that of the variable instance.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new EvenNumberPrinter();
        numberPrinter.printSomeNumbers();
    }

    private static class EvenNumberPrinter extends NumberPrinter {
        public void printSomeNumbers() {
            System.out.println("2468");
        }
    }

    private static class NumberPrinter {
        public void printSomeNumbers() {
            System.out.println("123456");
        }
    }
}
