package com.codingBatSolutions.warmup1;

public class MixStart {
    /* Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public static boolean mixStart(String str) {
//        if (str.length() >= 3) {
//            if (str.indexOf("ix") == 1) {
//                return true;
//            } else {
//
//            }
//
//        }return false;

        if (str.length() < 3) return false;

        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println(mixStart("mi"));
    }
}
