package TestCases; 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.BankAccount;


public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    //  deposit updates balance
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    //  withdraw updates balance
    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    // ✅ insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(2000.0);
        });
    }

    // balance unchanged after failed withdrawal
    @Test
    void testBalanceUnchangedAfterFailedWithdraw() {
        try {
            account.withdraw(5000.0);
        } catch (Exception ignored) {}

        assertEquals(1000.0, account.getBalance());
    }

    // invalid deposit
    @Test
    void testInvalidDeposit() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    // invalid withdrawal
    @Test
    void testInvalidWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        });
    }
}
