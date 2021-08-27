package by.academy.jc.sergeichik;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnagramUtilsTest {
    AnagramUtils words = new AnagramUtils();
    @Test
    void shouldReturnAnagrams0() {

        assertEquals(true, words.isAnagram("anagram", "margana"));
    }
    @Test
    void shouldReturnAnagrams1() {

        assertEquals(false, words.isAnagram("anagramm", "marganaa"));
    }
    @Test
    void shouldReturnAnagrams2() {

        assertEquals(true, words.isAnagram("Hello", "hello"));
    }
    @Test
    void shouldReturnAnagrams3() {

        assertEquals(true, words.isAnagram("CAT", "AcT"));
    }
    @Test
    void shouldReturnAnagrams4() {

        assertEquals(false, words.isAnagram("anagrammmmmmmmmmmm", "marganaa"));
    }
}
