package TestCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.DatabaseConnection;

public class DatabaseConnectionTest {
	private DatabaseConnection db;

    // runs before each test
    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    // runs after each test
    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testDatabaseIsConnected() {
        assertTrue(db.isConnected());
    }

    @Test
    void testDatabaseConnectionStatus() {
        assertEquals(true, db.isConnected());
    }
}
