package com.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String C = "Celsius", F = "Fahrenheit", K = "Kelvin";
        int option;
        double c, f, k, result;
        char dSymbol = '\u00B0';
        System.out.println(
                "Welcome to the Temperature Converter App (console)\nHow would you like to compute the change in Temperature\n\nfrom \n1. "
                        + C + " to " + F + "\n2. " + F + " to " + C + "\n3. " + F + " to " + K + "\n4. " + K + " to "
                        + C + "\n5. " + F + " to " + K + "\n6. " + K + " to " + F);
        System.out.print("Enter your preferred option\n");
        option = keyboard.nextInt();
        if (option == 1) {
            System.out.println("You have selected the " + C + " to " + F + " option\nEnter the amount of " + C
                    + " you want to convert to " + F);
            c = keyboard.nextFloat();
            result = (9.0 / 5 * c) + 32;
            System.out.println(c + " to " + F + " is " + result + dSymbol + "F");
        } else if (option == 2) {
            System.out.println("You have selected the " + F + " to " + C + " option\nEnter the amount of " + F
                    + " you want to convert to " + C);
            f = keyboard.nextFloat();
            result = 5 / 9.0 * (f - 32);
            System.out.println(f + " to " + C + " is " + result + dSymbol + "C");

        } else if (option == 3) {
            System.out.println("You have selected the " + C + " to " + K + " option\nEnter the amount of " + C
                    + " you want to convert to " + K);
            c = keyboard.nextFloat();
            result = c + 273.15;
            System.out.println(c + " to " + K + " is " + result + dSymbol + "K");

        } else if (option == 4) {
            System.out.println("You have selected the " + K + " to " + C + " option\nEnter the amount of " + K
                    + " you want to convert to " + C);
            k = keyboard.nextFloat();
            result = k - 273.15;
            System.out.println(k + " to " + C + " is " + result + dSymbol + "C");

        } else if (option == 5) {
            System.out.println("You have selected the " + F + " to " + K + " option\nEnter the amount of " + F
                    + " you want to convert to " + K);
            f = keyboard.nextFloat();
            result = 5.0 / 9 * (f - 32) + 273.15;
            System.out.println(f + " to " + K + " is " + result + dSymbol + "K");

        } else if (option == 6) {
            System.out.println("You have selected the " + K + " to " + F + " option\nEnter the amount of " + K
                    + " you want to convert to " + F);
            k = keyboard.nextFloat();
            result = 9.0 / 5 * (k - 273.15) + 32;
            System.out.println(k + " to " + F + " is " + result + dSymbol + "F");

        } else {
            System.out.println("The option you have selected is invalid");
        }
        keyboard.close();
    }
}