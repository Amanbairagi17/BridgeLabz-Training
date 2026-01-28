package TestCases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.TemperatureConverter;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    // Celsius to Fahrenheit
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.001);
    }

    // Fahrenheit to Celsius
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.001);
    }
}
