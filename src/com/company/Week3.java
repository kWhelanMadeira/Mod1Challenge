package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {

        //Problem 1//

        int Thing1;
        int Thing2;

        System.out.println("Enter a number");

        Scanner Althea = new Scanner(System.in);
        Thing1 = Althea.nextInt();

        System.out.println("Enter another number");

        Scanner Richard = new Scanner(System.in);
        Thing2 = Richard.nextInt();

        if (Thing1 > Thing2) System.out.println("First");
        else if (Thing2 > Thing1); System.out.println("Second");

        //Problem 2//

        System.out.println("Enter your favorite music genre");

        String Hayden;
        Scanner Liam = new Scanner(System.in);
        Hayden = Liam.nextLine();

        if (Hayden.equals("Soft pop")) System.out.print("Same");
        else System.out.println("Lame");

        System.out.println("");

        //Problem 3//

        for (int i = 10; i > 0; i--) {
            System.out.println("I have a number. Try to guess it :)");
            System.out.println("Enter a Guess here:");

            Scanner Guess = new Scanner(System.in);
            int guess = Guess.nextInt();

            if (guess == 81) System.out.println("Correct");
            else System.out.println("Incorrect.");
        }

        //Problem 4//

        System.out.println("");

        int Thea = 5;

        while (Thea > 0) {
            System.out.println("");
            int Nathan = 0;
            while (Nathan < Thea){
                System.out.print("*");
                Nathan +=1;
            }
        Thea -=1;

        }

        System.out.println("");

        //Problem 5//

        int Cosette = 3;

        while (Cosette > 0) {
            System.out.println("");
            int Marius = 0;
            while (Marius < Cosette){
                System.out.print("*");
                Marius +=1;
            }
            Cosette -=1;

            /*
            okay okay I know it's not exactly the code written hut I've been at this for hours so
            hopefully this is good enough
            i know I'm supposed to divide by two somewhere, but I can't figure out where...
             */
        }




    }
}
