package com.codingBatSolutions.warmup1;

public class IcyHot {
    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */

    public static boolean icyHot (int temp1, int temp2){

        return((temp1<0 || temp2<0) && (temp1>100 || temp2> 100));

        // return ((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100));
    }

    public static void main(String[] args) {
        System.out.println(icyHot(120,-1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));
    }
}
