package by.academy.jc;

import org.junit.jupiter.api.Test;

import static by.academy.jc.AnagramsUtils.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramsUtilsTest {

    @Test
    public void testCase1() throws Exception {
        assertTrue(isAnagram("anagram", "margana"));
    }
    @Test
    public void testCase2() throws Exception {
        assertFalse(isAnagram("anagramm", "marganaa"));
    }
    @Test
    public void testCase3() throws Exception {
        assertTrue(isAnagram("Hello", "hello"));
    }


    @Test
    public void argsAreInvalid() {
        assertThrows(Exception.class, () -> isAnagram("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq", "q"));
    }

}