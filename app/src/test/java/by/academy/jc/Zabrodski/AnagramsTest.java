package by.academy.jc.Zabrodski;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramsTest {

  @Test
  public void returnsBooleanIfStringsAreAnagrams1() {
    String input1 = "hEoLl";
    String input2 = "eHllo";
    assertEquals(true, Anagrams.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams2() {
    String input1 = "anagram";
    String input2 = "margana";
    assertEquals(true, Anagrams.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams3() {
    String input1 = "anagramm";
    String input2 = "marganaa";
    assertEquals(false, Anagrams.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams4() {
    String input1 = "Hello";
    String input2 = "hello";
    assertEquals(true, Anagrams.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams5() {
    String input1 = "Hello world";
    String input2 = "hello WORLD";
    assertEquals(true, Anagrams.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams6() {
    String input1 = "Hello world";
    String input2 = "hello";
    assertEquals(false, Anagrams.isAnagram(input1, input2));
  }

}