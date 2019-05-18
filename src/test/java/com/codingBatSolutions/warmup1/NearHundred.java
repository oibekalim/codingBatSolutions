package com.codingBatSolutions.warmup1;

public class NearHundred {

    /* Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
     */

    public static boolean nearHundred(int n){
//        if (Math.abs(100-n)<=10 || Math.abs(200-n) <= 10){
//            return true;
//        }
//        return false;
//    }

    return (Math.abs(100-n) <=10 || Math.abs(200-n) <=10);
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(110));
    }
}
