package com.codingBatSolutions.warmup1;

public class EndUp {
    /* Given a string, return a new string where the last 3 chars are now in upper case. If the
    string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
    returns the uppercase version of a string.
     */

    public static String endUp(String str){
        int len = str.length()-3;

        if (len>=0){
            return (str.substring(0,len)+str.substring(len).toUpperCase());
        }else {
            return str.toUpperCase();
        }
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi"));
    }
}
