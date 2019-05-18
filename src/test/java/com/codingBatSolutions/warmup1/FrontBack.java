package com.codingBatSolutions.warmup1;

public class FrontBack {
    /* Given a string, return a new string where the first and last chars have been exchanged.
     */

    public String frontBack(String str){
//        int len =str.length();
//        if (len>=2){
//           len--;
//            return (str.charAt(len)+str.substring(1,len)+str.charAt(0));
//        }
//        return str;

        if (str.length() <= 1)

        return str;

        String middle = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + middle + str.charAt(0);

    }

    public static void main(String[] args) {

        FrontBack backFront = new FrontBack();

        System.out.println(backFront.frontBack("code"));
        System.out.println(backFront.frontBack("ba"));
        System.out.println(backFront.frontBack("a"));
    }
}
