package by.academy.jc.akbarova.ht5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramUtilsTest {

    @Test
    void shouldReturn_TrueOrFalse_IfTheseTwoWordsAnagram1() {

        assertTrue(AnagramUtils.isAnagram("anagram", "margana"));
    }

    @Test
    void shouldReturn_TrueOrFalse_IfTheseTwoWordsAnagram2() {

        assertFalse(AnagramUtils.isAnagram("anagramm", "marganaa"));
    }

    @Test
    void shouldReturn_TrueOrFalse_IfTheseTwoWordsAnagram3() {

        assertTrue(AnagramUtils.isAnagram("Hello", "hello"));
    }
}