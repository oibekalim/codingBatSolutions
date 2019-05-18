package com.codingBatSolutions.warmup1;

public class IntMax {
    //Given three int values, a b c, return the largest.

    public static int intMax(int a, int b, int c){

        if(a>b && a>c){
            return a;
        }else if (b>a && b>c) {
            return b;
        }return c;

//        int max = a;
//        if(b > max)
//            max = b;
//        if (c > max)
//            max = c;
//        return max;
    }

    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(3,2,1));
        System.out.println(intMax(1,3,2));
    }
}
