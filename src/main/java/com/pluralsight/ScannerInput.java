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







    }
}
