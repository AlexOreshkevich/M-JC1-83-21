package by.academy.jc.ht.skopinov.ht12;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class WordSplitterTest {

  @Test
  void isAmountOfDifferentGettingWordsCorrect() throws IOException {
    WordSplitter ws = new WordSplitter();
    ws.gettingWords("Skopinov.testData.txt");
    assertEquals(12, ws.map.size());
  }

  @Test
  void isFrequencyOfCurrentWordsCorrectWithIgnoreCase() throws IOException {
    WordSplitter ws = new WordSplitter();
    ws.gettingWords("Skopinov.testData.txt");
    assertEquals(5, ws.map.get("to"));
    assertEquals(6, ws.map.get("toboggan"));
  }

  @Test
  void frequencyTest() throws IOException {
    WordSplitter ws = new WordSplitter();
    ws.gettingWords("Skopinov.testData.txt");
    assertEquals(6, ws.frequency("toboggan"));
    assertEquals(-1, ws.frequency("cat"));
  }

  @Test
  void getMaxFrequencyTest() throws IOException {
    WordSplitter ws = new WordSplitter();
    ws.gettingWords("Skopinov.testData.txt");
    ws.getMaxFrequency();
    assertEquals(6, ws.maxFrequency);
    assertEquals("toboggan", ws.maxFrequencyWords.get(0));
  }

  @Test
  void getMaxFrequencyBigDataTest() throws IOException {
    WordSplitter ws = new WordSplitter();
    ws.gettingWords("Skopinov.data.txt");
    ws.getMaxFrequency();
    assertEquals(892, ws.maxFrequency);
    assertEquals("the", ws.maxFrequencyWords.get(0));
  }
}