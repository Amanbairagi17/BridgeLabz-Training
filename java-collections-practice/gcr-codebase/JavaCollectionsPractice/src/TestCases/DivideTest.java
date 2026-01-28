package TestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.Divide;

class DivideTest {

    @Test
    void testDivideByZeroException() {

        Divide d = new Divide();

        // verify exception
        assertThrows(ArithmeticException.class, () -> {
            d.divide(10, 0);
        });
    }

    @Test
    void testDivideValid() {
    	Divide d = new Divide();

        assertEquals(5, d.divide(10, 2));
    }
}
