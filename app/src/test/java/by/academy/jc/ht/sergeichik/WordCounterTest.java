package by.academy.jc.ht.sergeichik;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WordCounterTest {

  WordCounter classUnderTest = new WordCounter();

  @Test
  void shouldReturnCountWords0() {

    assertEquals(7, WordCounter.words("Count  fdhfh  fghdfgh the  number of words"));
  }

  @Test
  void shouldReturnCountWords1() {
    assertEquals(5, WordCounter.words("    Count    the  number of words   "));
  }

  @Test
  void shouldReturnCountWords2() {
    assertEquals(1, WordCounter.words("246545334"));
  }

  @Test
  void shouldReturnCountWords3() {
    assertEquals(3,
        WordCounter.words("           765            2465               45334         "));
  }

  @Test
  void shouldReturnCountWords4() {
    assertEquals(2, WordCounter.words("Hell world!"));
  }
}