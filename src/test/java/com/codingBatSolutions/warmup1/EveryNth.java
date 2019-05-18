package com.codingBatSolutions.warmup1;

public class EveryNth {
    /*Given a non-empty string and an int N, return the string made starting with char 0, and then
    every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     */
//    everyNth("Miracle", 2) → "Mrce"
//    everyNth("abcdefg", 2) → "aceg"
//    everyNth("abcdefg", 3) → "adg"

    private static String everyNth (String str, int n){

//        String result ="";
//
//        for (int i =0; i<str.length(); i=i+n){
//            result += str.charAt(i);
//        }
//        return result;

        StringBuilder stbuild = new StringBuilder();

        for(int i = 0; i < str.length(); i += n)

            stbuild.append(str.charAt(i));

        return stbuild.toString();
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
        System.out.println(everyNth("bada fldafd dffdg d",4));
    }
}
