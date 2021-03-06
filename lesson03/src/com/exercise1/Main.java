package com.exercise1;
/**
 * WordTool Application
 *It shows the usage of String class methods.
 *
 * @author Masih Omid
 * @version 0.1
 * @since 20190305
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a,b= 0;
        Boolean continueFlag = true;
        String continueFromUser = "";
        Scanner myScanner = new Scanner(System.in);
        Trigonometry myTrigonometry = new Trigonometry();
        String firstSide,secondSide ="";


        while (continueFlag) {

            System.out.println("Enter the value for the first side of your triangle:");
            firstSide = myScanner.next();

            if (!myTrigonometry.isNumeric(firstSide)){
                System.out.println("please enter a numeric value");
                continue;
            }

            a = Integer.parseInt(firstSide);

            System.out.println("Enter the value for the second side of your triangle:");
            secondSide = myScanner.next();

            if (!myTrigonometry.isNumeric(secondSide)){
                System.out.println("please enter a numeric value");
                break;
            }

            b = Integer.parseInt(secondSide);

            System.out.println("The hypotenuse for " + a + " and " + b + " is equal to " + myTrigonometry.calculateHypontenuse(a, b));
            System.out.println("Continue... y/n?");
            continueFromUser = myScanner.next();
            if (continueFromUser.equalsIgnoreCase("n")){
                continueFlag = false;
            }

        }

    }
}
