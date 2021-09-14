package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */


public class App 
{
    public static void main( String[] args )
    {
        double TAXRATE;
        double Tax = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("What is the order amount: ");
        double OrderTotal = input.nextDouble();
        input.nextLine();
        System.out.print("What state do you live in? ");
        String State = input.nextLine();

        if (State.equalsIgnoreCase("Wisconsin")) {
            TAXRATE = 0.05;
            System.out.print("What county do you live in? ");
            String County = input.nextLine();

            if (County.equalsIgnoreCase("Dunn")) {
                TAXRATE += 0.004;
            }
            if (County.equalsIgnoreCase("Eau Claire")) {
                TAXRATE += 0.005;
            }

            Tax = OrderTotal * TAXRATE;
            System.out.printf("The tax is $%.2f\n", Tax);
        }

        if (State.equalsIgnoreCase("Illinois")) {
            TAXRATE = 0.08;
            Tax = OrderTotal * TAXRATE;
            System.out.printf("The tax is $%.2f\n", Tax);
        }

        double total = OrderTotal + Tax;
        System.out.printf("The total is $%.2f.", total);
    }
}



