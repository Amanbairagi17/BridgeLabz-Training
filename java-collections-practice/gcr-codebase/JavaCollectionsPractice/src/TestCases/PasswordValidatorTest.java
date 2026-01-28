package TestCases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.PasswordValidator;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    //valid passwords
    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Secure123"));
        assertTrue(validator.isValid("JavaTest9"));
    }

    // less than 8 characters
    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    // no uppercase letter
    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    // no digit
    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    //null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
