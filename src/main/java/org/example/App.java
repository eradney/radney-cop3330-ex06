/**
 * UCF COP3330 Fall 2021 Assignment 6 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Date;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String userAge, goalAge;
        int age, retAge, retire, year;
        Date d = new Date();
        Scanner scnr = new Scanner(System.in);
        year = d.getYear() + 1900;

        System.out.print("What is your current age? ");
        userAge = scnr.next();
        age = Integer.parseInt(userAge);

        System.out.print("At what age would you like to retire? ");
        goalAge = scnr.next();
        retAge = Integer.parseInt(goalAge);

        retire = retAge - age;

        System.out.println("You have " + retire + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + (year + retire) + ".");
    }
}
