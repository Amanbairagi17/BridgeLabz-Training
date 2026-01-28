package TestCases;

import com.junit.EvenNumber;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberTest {
	private final EvenNumber evenNumber = new EvenNumber();
	
	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEvenWithMultipleValues(int number) {

        boolean result = evenNumber.isEven(number);

        if (number % 2 == 0) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }
    }
}
