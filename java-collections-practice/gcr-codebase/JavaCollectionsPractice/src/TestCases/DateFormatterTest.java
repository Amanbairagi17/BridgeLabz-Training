package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.DateFormatter;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    // valid date
    @Test
    void testValidDate() {
        assertEquals("28-01-2026",
                formatter.formatDate("2026-01-28"));
    }

    // invalid format
    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("28-01-2026");
        });
    }

    // invalid date
    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-13-40");
        });
    }

    // null input
    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}
