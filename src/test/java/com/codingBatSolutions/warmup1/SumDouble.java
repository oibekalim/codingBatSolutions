package com.codingBatSolutions.warmup1;

public class SumDouble {

    /* Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.
     */

    public static int sumDouble(int a, int b) {

        // I. way
//        int total = a+b;
//        if (a==b){
//            return 2 * total;
//        }return total;

        // II. way
//        if ((a>b) || (a<b)){
//            return a+b;
//        }
//            return 2*(a+b);

        // III. way
        return (a == b) ? 2 * (a + b) : a + b;

    }

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }
}
