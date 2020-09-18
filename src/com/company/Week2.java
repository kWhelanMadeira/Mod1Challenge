package com.company;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        //Challenge 1//

        String First;
        First = "Kora";
        System.out.println (First);
        String Middle;
        Middle = "Lu";
        System.out.println (Middle);
        String Last;
        Last = "Whelan";
        System.out.println (Last);

        //Challenge 2//

        String Hi;
        Hi = "Hello ";
        System.out.print(Hi);
        Hi = "World";
        System.out.print(Hi);

        /*
        I used 'print' instead of 'println', does that count?
         */

        /*
        gap because i wanted them separate but together, do not question me (unless
        this affects my grade, then definitely question me)
         */

        String This = "";
        System.out.println(This);

        //Challenge 3//

        int Chocolate = 10;
        int Vanilla = 5;
        System.out.println(Chocolate + Vanilla);
        String That = " ^ years old (I am an old lady)";
        System.out.println(That);

        /*
        my gosh I don't know how to code someone help me
        I can't even get these lines to print in the same line uuuuuuugh
         */

        //Challenge 4//

        Scanner TweedleDum = new Scanner(System.in);
        System.out.println(TweedleDum);
        String Kora = TweedleDum.nextLine();
        System.out.println("I say: Part of my name is " +Kora);

        Scanner TweedleDee = new Scanner(System.in);
        System.out.println(TweedleDee);
        String Whelan = TweedleDee.nextLine();
        System.out.println("I say: The other part is " +Whelan);

        //so i guess my last name is a typo...//

        //I'm sorry, I just couldn't figure out how to make it distinguish one name from the other, so I improvised//

        //Challenge 5//

        int i = 4;
        int x = 2;
        int j = 0;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);

        //Challenge 6//

        /*
        which I never got around to because I was evicted from my room and onto the deck
        where focusing and actually being productive is the stuff of dreams

        I wanted to attempt it but the universe looked me in the eyes and it told me no
         */


        int counter = 0;
        while (counter < 100); {
            if (counter > 100) System.out.println("one");
            else if (counter == 100) System.out.println("two");
            counter ++;
        }

    }

}
