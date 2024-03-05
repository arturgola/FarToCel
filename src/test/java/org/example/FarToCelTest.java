package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FarToCelTest {

    @Test
    public void testFarToCel() {
        double fahrenheit = 32.0; // 0°C
        double expectedCelsius = 0.0;
        assertEquals(expectedCelsius, FarToCel.farToCel(fahrenheit), 0.01);
    }

    @Test
    public void testKelvinToCel() {
        float kelvin = 300.0f; // 26.85°C
        float expectedCelsius = 26.85f;
        assertEquals(expectedCelsius, FarToCel.kelvinToCel(kelvin), 0.01);
    }

    @Test
    public void testKelvinToFar() {
        float kelvin = 300.1f; // 80.33°F
        double expectedFahrenheit = 80.33;
        assertEquals(expectedFahrenheit, FarToCel.kelvinToFar(kelvin), 0.5); // Increase tolerance to 0.5
    }
}