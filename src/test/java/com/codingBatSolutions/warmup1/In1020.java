package com.codingBatSolutions.warmup1;

public class In1020 {
    /* Given 2 int values, return true if either of them is in the range 10..20 inclusive.

     */
    public static boolean in1020(int a, int b){
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static void main(String[] args) {
        System.out.println(in1020(12,99));
        System.out.println(in1020(21,12));
        System.out.println(in1020(8,99));
    }
}

