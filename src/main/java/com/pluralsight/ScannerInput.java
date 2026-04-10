package com.pluralsight;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        // created new scanner
        Scanner michalScanner = new Scanner(System.in);
        // ask the user for input
      System.out.print("Enter your name here : ");
      String name = michalScanner.nextLine();
      // print
      System.out.println("Hello " + name + " you got this keep going .");

        //System.out.print




    }
}
