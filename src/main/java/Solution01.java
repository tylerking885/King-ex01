/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution 01
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;                                           // Import declaration for class scanner

public class Solution01 {
    public static void main(String[] args){                         // Main method
        String myName;                                              // String declaration variable
        Scanner input = new Scanner(System.in);                     // Enable program to read User data
        System.out.print("What is your name? ");                    // Prompt user for a name to enter into myName
        myName = input.nextLine();                                  // Sets user input into myName string variable
        System.out.printf("%nHello, %s, nice to meet you!%n", myName); // Print out a message including the users input
    }
}