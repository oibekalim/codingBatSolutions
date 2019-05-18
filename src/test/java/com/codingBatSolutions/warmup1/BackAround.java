package com.codingBatSolutions.warmup1;

public class BackAround {
    /* Given a string, take the last char and return a new string with the last char added at the
    front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
     */

    public String backAround(String str){

        int len = str.length()-1;
        String temp;

        if (len < 1){
            return (str+str+str);
        }
        return (str.charAt(len) +str+str.charAt(len));
    }

    public static void main(String[] args) {

        BackAround b = new BackAround();
        System.out.println(b.backAround("cat"));
        System.out.println(b.backAround("Hello"));
        System.out.println(b.backAround("a"));
    }
}
