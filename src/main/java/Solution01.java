/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args){
        String myName;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        myName = input.nextLine();
        System.out.printf("%nHello, %s, nice to meet you!%n", myName);
    }
}
