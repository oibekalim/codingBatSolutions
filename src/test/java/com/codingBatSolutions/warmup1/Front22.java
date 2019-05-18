package com.codingBatSolutions.warmup1;

public class Front22 {

    /* Given a string, take the first 2 chars and return the string with the 2 chars added at both
    the front and back, so "kitten" yields"kikittenki". If the string length is less than 2,
    use whatever chars are there.
     */
    public String front22(String str){
        if (str.length()-1>2){
            return (str.substring(0,2)+str+str.substring(0,2));
        }
        return (str+str+str);
    }

    public static void main(String[] args) {

        Front22 f22 = new Front22();

        System.out.println(f22.front22("kitten"));
        System.out.println(f22.front22("Ha"));
        System.out.println(f22.front22("a"));
    }
}
