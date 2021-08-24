package by.academy.jc.dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramsTest {
    @Test
    public void shouldShowAreTheWordsAnagrams(){
        assertEquals("Anagrams", Anagrams.isAnagram("anagram", "margana"));
    }
    @Test
    public void shouldShowAreTheWordsAnagrams1(){
        assertEquals("Not Anagrams", Anagrams.isAnagram("anagramm", "marganaa"));
    }
    @Test
    public void shouldShowAreTheWordsAnagrams2(){
        assertEquals("Anagrams", Anagrams.isAnagram("Hello", "hello"));
    }
}
