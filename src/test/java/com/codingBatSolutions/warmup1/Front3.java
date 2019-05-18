package com.codingBatSolutions.warmup1;

public class Front3 {
    /* Given a string, we'll say that the front is the first 3 chars of the string. If the string length is
    less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
     */

    public String front3(String str){

//        if (str.length()-1<3){
//            return (str+str+str);
//        }
//        String s = str.substring(0,3);
//        return (s+s+s);

        String f;

        if (str.length() > 3) {
            f = str.substring(0, 3);
        }
        else {
            f = str;
        }
        return f + f + f;

    }

    public static void main(String[] args) {

        Front3 f3 =new Front3();

        System.out.println(f3.front3("Java"));
        System.out.println(f3.front3("Chocolate"));
        System.out.println(f3.front3("abc"));
        System.out.println(f3.front3("ab"));

    }
}
