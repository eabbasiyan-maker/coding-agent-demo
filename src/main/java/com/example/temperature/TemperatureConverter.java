package com.example.temperature;

/** Converts temperatures between Celsius and Fahrenheit. */
public class TemperatureConverter {

    /**
     * Converts a Celsius temperature to Fahrenheit.
     *
     * @param celsius temperature in degrees Celsius
     * @return temperature in degrees Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
