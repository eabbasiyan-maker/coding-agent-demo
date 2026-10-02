package com.example.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    @Test
    void convertsZeroCelsiusToThirtyTwoFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(32.0, converter.celsiusToFahrenheit(0.0));
    }
}
