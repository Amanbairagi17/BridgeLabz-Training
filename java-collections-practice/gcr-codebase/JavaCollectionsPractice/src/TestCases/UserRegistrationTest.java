package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.UserRegistration;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    // valid registration
    @Test
    void testValidUserRegistration() {

        String result = registration.registerUser(
                "aman",
                "aman@gmail.com",
                "Password1"
        );

        assertEquals("User registered successfully", result);
    }

    // invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "",
                    "test@gmail.com",
                    "Password1"
            );
        });
    }

    // invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "user",
                    "invalid-email",
                    "Password1"
            );
        });
    }

    // invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "user",
                    "user@gmail.com",
                    "123"
            );
        });
    }

    // null inputs
    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
