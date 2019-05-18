package com.codingBatSolutions.warmup1;

public class StringE {
    // Return true if the given string contains between 1 and 3 'e' chars
    public static boolean stringE (String str){

        int count =0;

        for (int i =0; i<str.length();i++ ){
            if (str.charAt(i) =='e')
                count++;
            // str.substring(i, i+1).equals("e")
        } return (count >=1 && count <=3);
    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelele"));
        System.out.println(stringE("Heelle"));
    }
}
