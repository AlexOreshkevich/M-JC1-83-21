package by.academy.jc.zabrodsky.ht5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramsUtilsTest {

  @Test
  public void returnsBooleanIfStringsAreAnagrams1() {
    String input1 = "hEoLl";
    String input2 = "eHllo";
    assertEquals(true, AnagramsUtils.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams2() {
    String input1 = "anagram";
    String input2 = "margana";
    assertEquals(true, AnagramsUtils.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams3() {
    String input1 = "anagramm";
    String input2 = "marganaa";
    assertEquals(false, AnagramsUtils.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams4() {
    String input1 = "Hello";
    String input2 = "hello";
    assertEquals(true, AnagramsUtils.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams5() {
    String input1 = "Hello world";
    String input2 = "hello WORLD";
    assertEquals(true, AnagramsUtils.isAnagram(input1, input2));
  }

  @Test
  public void returnsBooleanIfStringsAreAnagrams6() {
    String input1 = "Hello world";
    String input2 = "hello";
    assertEquals(false, AnagramsUtils.isAnagram(input1, input2));
  }

}