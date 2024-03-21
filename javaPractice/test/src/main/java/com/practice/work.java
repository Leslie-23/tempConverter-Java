package com.practice;

import java.util.Scanner;

public class work {
    private static final String CELSIUS = "Celsius";
    private static final String FAHRENHEIT = "Fahrenheit";
    private static final String KELVIN = "Kelvin";
    private static final char DEGREE_SYMBOL = '\u00B0';

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Welcome to the Temperature Converter App (console)");
            System.out.println("How would you like to compute the change in Temperature?");
            System.out.println("1. " + CELSIUS + " to " + FAHRENHEIT);
            System.out.println("2. " + FAHRENHEIT + " to " + CELSIUS);
            System.out.println("3. " + FAHRENHEIT + " to " + KELVIN);
            System.out.println("4. " + KELVIN + " to " + CELSIUS);
            System.out.println("5. " + FAHRENHEIT + " to " + KELVIN);
            System.out.println("6. " + KELVIN + " to " + FAHRENHEIT);
            System.out.print("Enter your preferred option: ");

            int option = keyboard.nextInt();
            double inputTemperature;
            double conversionResult;

            switch (option) {
                case 1:
                    inputTemperature = getInputTemperature(keyboard, CELSIUS);
                    conversionResult = convertCelsiusToFahrenheit(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, FAHRENHEIT);
                    break;
                case 2:
                    inputTemperature = getInputTemperature(keyboard, FAHRENHEIT);
                    conversionResult = convertFahrenheitToCelsius(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, CELSIUS);
                    break;
                case 3:
                    inputTemperature = getInputTemperature(keyboard, FAHRENHEIT);
                    conversionResult = convertFahrenheitToKelvin(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, KELVIN);
                    break;
                case 4:
                    inputTemperature = getInputTemperature(keyboard, KELVIN);
                    conversionResult = convertKelvinToCelsius(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, CELSIUS);
                    break;
                case 5:
                    inputTemperature = getInputTemperature(keyboard, FAHRENHEIT);
                    conversionResult = convertFahrenheitToKelvin(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, KELVIN);
                    break;
                case 6:
                    inputTemperature = getInputTemperature(keyboard, KELVIN);
                    conversionResult = convertKelvinToFahrenheit(inputTemperature);
                    printConversionResult(inputTemperature, conversionResult, FAHRENHEIT);
                    break;
                default:
                    System.out.println("Invalid option selected.");
            }
        }
    }

    private static double getInputTemperature(Scanner keyboard, String unit) {
        System.out.print("Enter the amount of " + unit + " you want to convert: ");
        return keyboard.nextDouble();
    }

    private static void printConversionResult(double inputTemperature, double conversionResult, String unit) {
        System.out.println(inputTemperature + " " + unit + " is " + conversionResult + DEGREE_SYMBOL + unit.charAt(0));
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (9.0 / 5 * celsius) + 32;
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32);
    }

    private static double convertFahrenheitToKelvin(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32) + 273.15;
    }

    private static double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double convertKelvinToFahrenheit(double kelvin) {
        return 9.0 / 5 * (kelvin - 273.15) + 32;
    }
}
