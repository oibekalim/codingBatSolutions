package com.codingBatSolutions.warmup1;

public class ParrotTrouble {

    /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     Return true if we are in trouble.
      */

    // int hour;
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;

        // return (talking && (hour < 7 || hour > 20));
    }

    public static void main(String[] args) {
        int hour = 0;
        if (hour > 23) {
            System.out.println("Please put correct hour format");
        }
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));


    }
}
