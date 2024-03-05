package org.example;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class FarToCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = farToCel(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);

        System.out.print("Enter temperature in Kelvin: ");
        float kelvin = scanner.nextFloat();
        float celsiusFromKelvin = kelvinToCel(kelvin);
        System.out.println("Temperature in Celsius from Kelvin: " + celsiusFromKelvin);

        // Convert Kelvin to Fahrenheit and display
        double fahrenheitFromKelvin = kelvinToFar(kelvin);
        System.out.println("Temperature in Fahrenheit from Kelvin: " + fahrenheitFromKelvin);

        // Assert some conversions
        float kelvinInput = 300.1f;
        float expectedCelsiusFromKelvin = 26.95f;
        assertEquals(expectedCelsiusFromKelvin, kelvinToCel(kelvinInput), 0.01);

        double fahrenheitInput = 59.0;
        double expectedCelsiusFromFahrenheit = 15.0;
        assertEquals(expectedCelsiusFromFahrenheit, farToCel(fahrenheitInput), 0.01);
    }

    public static double farToCel(double far) {
        return (far - 32) * 5 / 9;
    }

    public static float kelvinToCel(float kel) {
        return kel - 273.15f;
    }

    public static double kelvinToFar(float kel) {
        return (kel - 273.15) * (9.0 / 5.0) + 32;
    }
}