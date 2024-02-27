package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FarToCelTest {

    @Test
    public void testKelvinToCel() {
        float kelvin = 300;
        float expectedCelsius = 26.85f;
        assertEquals(expectedCelsius, FarToCel.kelvinToCel(kelvin), 0.01);
    }
}
