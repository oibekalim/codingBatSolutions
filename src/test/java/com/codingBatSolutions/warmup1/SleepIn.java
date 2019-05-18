package com.codingBatSolutions.warmup1;

public class SleepIn {
    /*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
      */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) { //(not weekday or vacation)
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

         SleepIn sleep =new SleepIn();

        System.out.println(sleep.sleepIn(true,false));
        System.out.println(sleep.sleepIn(false, false));
        System.out.println(sleep.sleepIn(false, true));

    }
}
