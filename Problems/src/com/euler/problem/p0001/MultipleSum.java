package com.euler.problem.p0001;

/**
 * https://projecteuler.net/problem=1
 */
public class MultipleSum {
    public static void main(String[] args) {
        long num = sumTwoMultiples(3, 5, 1000);
        System.out.println("Sum multiples of 3 & 5 below 1000: " + num);
    }

    // assume a, b, max are positive integer
    public static long sumTwoMultiples(int a, int b, int max) {
        if (a==b) {
            return sumMultiple(a, max);
        }
        return sumMultiple(a, max) - sumMultiple(a*b, max) + sumMultiple(b, max);
    }

    private static long sumMultiple(int n, int max) {
        int k = max-1/n;
        return n*k*(k+1)/2;
    }
}
