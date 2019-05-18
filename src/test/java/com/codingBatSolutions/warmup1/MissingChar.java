package com.codingBatSolutions.warmup1;

public class MissingChar {
    /* Given a non-empty string and an int n, return a new string where the char at index n
    has been removed. The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
     */

    public static String  missingChar(String str, int n){
//        if (str.substring(0, n) + str.substring(n+1, str.length())){
//            return true;
//        }else {
//            return false;
//        }

       // return (str.substring(0, n) + str.substring(n+1, str.length()));

        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }

    public static void main(String[] args) {
        System.out.println(missingChar("kitten",1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten",5));
    }
}
