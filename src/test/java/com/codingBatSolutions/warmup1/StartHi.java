package com.codingBatSolutions.warmup1;

public class StartHi {
    /* Given a string, return true if the string starts with "hi" and false otherwise.
     */

    public boolean startHi(String str){

        return (str.startsWith("hi"));

//        if (str.length()>=2){
//            if (str.substring(0,2).equals("hi")){
//                return true;
//            }
//        }return false;
    }

    public static void main(String[] args) {

        StartHi s = new StartHi();

        System.out.println(s.startHi("hello hi"));
        System.out.println(s.startHi("hi there"));
        System.out.println(s.startHi("hi"));
    }

}
