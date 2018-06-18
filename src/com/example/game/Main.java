package com.example.game;

public class Main {

    public static void main(String[] args) {
        /**
         * Create a suitable named package containing a class called Series
         * with the following static methods:
         * nSum(int n) returns the sum of all numbers from 0 to n, The first 10 numbers are:
         * 0, 1, 2, 3, 6, 10, 15, 21, 28, 36, 45, 55.
         *
         * factorial(int n) returns the product off all numbers from 1 to n
         *    i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
         *    The first 10 factorials are:
         *    0, 1, 2, 6, 24, 120, 5040, 40320, 362880, 3628800.
         *
         *    fibonacci(n) returns the nth Fibonacci number. These are defined as:
         *    f(0) = 0
         *    f(1) = 1
         *    f(n) = f(n - 1) + f(n - 2)
         *    (so f(2) is also 1. The first 10 fibonacci numbers are:
         *    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
         *
         *    When you have tested your function, delete the Main class and produce a jar file
         *
         *    Create a new project and add you Series library, then test the three methods
         *    in the main() method of your new project.
         */

        Series series = new Series();

        // int value = series.nSum(10);
        // int value = series.factorial(10);
        int value = series.fibonacci(10);
        System.out.println("Total value = " + value);

    }
}
