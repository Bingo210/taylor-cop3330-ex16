/*
 * UCF COP3330 Fall 2021 Assignment 16 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is your age?" );
        String userAge = input.nextLine();
        int age = Integer.parseInt(userAge);

        if (age >= 16)
            System.out.println("You are old enough to legally drive.");
        else
            System.out.println("You are not old enough to legally drive.");
    }
}
