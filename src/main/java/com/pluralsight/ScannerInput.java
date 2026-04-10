package com.pluralsight;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        // created new scanner
        Scanner michalScanner = new Scanner(System.in);
        // ask the user for input
      System.out.print("Enter your name here : ");
      // store it in a variable in the next line
      String name = michalScanner.nextLine();
      // print the input and any other strings concatenated
      System.out.println("Hello " + name + " you got this keep going .");

      System.out.print("What is your favorite color? ");
      String favColor = michalScanner.nextLine();
        System.out.println("Your Favorite color is " + favColor);

        System.out.print("Do you have any brothers ? ");
        String brothers = michalScanner.nextLine();
        System.out.println("Do you have brothers? " + brothers);

        System.out.print("How many brothers do you have ? ") ;
        int numBrothers = michalScanner.nextInt();
        System.out.println("You have " + numBrothers + " brothers");
        // Calculator
        // created new scanner to calculate the sum of two numbers

        Scanner myScanner = new Scanner(System.in );

        // ask input for the first number

        System.out.print(" Write the first number here :");

        // store the input you get in the variable named first number

        int firstNumber = myScanner.nextInt();

        // ask input for the second number

        System.out.print("Write your second number here : ");

        // store the input you get in the variable named second number

        int secondNumber = myScanner.nextInt();

        // a variable that stores the sum of the two numbers

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);








    }
}
