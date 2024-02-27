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

        float kelvin = 300;
        float expectedCelsius = 26.85f;
        assertEquals(expectedCelsius, kelvinToCel(kelvin), 0.01);
    }

    public static double farToCel(double far) {
        return (far - 32) * 5 / 9;
    }

    public static float kelvinToCel(float kel) {
        return kel - 273.15f;
    }

}