package TestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.StringUtils;

class StringUtilsTest {

    //reverse() tests 

    @Test
    void testReverseNormalString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    // isPalindrome() tests 

    @Test
    void testPalindromeTrue() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeIgnoreCase() {
        assertTrue(StringUtils.isPalindrome("Level"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testPalindromeNull() {
        assertFalse(StringUtils.isPalindrome(null));
    }

    // toUpperCase() tests

    @Test
    void testToUpperCaseNormal() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseAlreadyUpper() {
        assertEquals("JAVA", StringUtils.toUpperCase("JAVA"));
    }

    @Test
    void testToUpperCaseEmptyString() {
        assertEquals("", StringUtils.toUpperCase(""));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(StringUtils.toUpperCase(null));
    }
}
