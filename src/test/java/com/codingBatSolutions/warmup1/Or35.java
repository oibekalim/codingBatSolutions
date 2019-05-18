package com.codingBatSolutions.warmup1;

public class Or35 {

    /* Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
     */

    public boolean or35 (int n){
        return  (n%3 ==0 || n%5 ==0);

    }


    public static void main(String[] args) {

        Or35 div = new Or35();

        System.out.println(div.or35(3));
        System.out.println(div.or35(10));
        System.out.println(div.or35(8));
        System.out.println(div.or35(0));
    }
}
