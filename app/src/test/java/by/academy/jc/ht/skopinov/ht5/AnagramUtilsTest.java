package by.academy.jc.ht.skopinov.ht5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnagramUtilsTest {

  @Test
  void case1() throws IllegalArgumentException {
    assertTrue(AnagramUtils.isAnagram("anagram", "margana"));
  }

  @Test
  void case2() throws IllegalArgumentException {
    assertFalse(AnagramUtils.isAnagram("anagramm", "marganaa"));
  }

  @Test
  void case3() throws IllegalArgumentException {
    assertTrue(AnagramUtils.isAnagram("Hello", "hello"));
  }

  @Test
  void oneLetter() throws IllegalArgumentException {
    assertTrue(AnagramUtils.isAnagram("A", "a"));
  }

  @Test
  void fiftyDifferentLetters() throws IllegalArgumentException {
    assertFalse(AnagramUtils.isAnagram("jklajefGJkgHFjHGjhkjGkjgkjggKJglkjhLJKgjhHJHjgLgdQ",
        "jKfghgFjGJHghjGfJHFHJJHGjjhgjhgjHGGhhlfDduLffHkFjk"));
  }

  @Test
  void twentyIdenticalLettersOfDifferentRegister() throws IllegalArgumentException {
    assertTrue(AnagramUtils.isAnagram("UUuuUuUuUUKhhkhhkhkk", "uuuuUuuUuuKKKhkHkHHH"));
  }

  @Test
  void wrongInputFiftyOneLetters() {
    assertThrows(IllegalArgumentException.class, () -> AnagramUtils
        .isAnagram("jklajefGJkgHFjHGjhkjGkjgkjggKJglkjhLJKgjhHJHjgLgdQw",
            "jKfghgFjGJHghjGfJHFHJJHGjjhgjhgjHGGhhlfDduLffHkFjkP"));
  }

  @Test
  void wrongInputInvalidCharacter() {
    assertThrows(IllegalArgumentException.class,
        () -> AnagramUtils.isAnagram("hello_world", "hello_world"));
  }
}