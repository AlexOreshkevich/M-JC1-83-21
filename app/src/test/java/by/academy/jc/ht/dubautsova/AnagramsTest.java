package by.academy.jc.ht.dubautsova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramsTest {

  @Test
  public void shouldShowAreTheWordsAnagrams() {
    assertEquals(true, Anagrams.isAnagram("anagram", "margana"));
  }

  @Test
  public void shouldShowAreTheWordsAnagrams1() {
    assertEquals(false, Anagrams.isAnagram("anagramm", "marganaa"));
  }

  @Test
  public void shouldShowAreTheWordsAnagrams2() {
    assertEquals(true, Anagrams.isAnagram("Hello", "hello"));
  }

  @Test
  public void shouldShowAreTheWordsAnagrams3() {
    assertEquals(true, Anagrams.isAnagram("CaT", "Act"));
  }

  @Test
  public void shouldShowAreTheWordsAnagrams4() {
    assertEquals(false, Anagrams.isAnagram("Helloooooo", "hello"));
  }
}
