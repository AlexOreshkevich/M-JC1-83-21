package by.academy.jc.ht.klimakhovich;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;


import static org.junit.jupiter.api.Assertions.*;

public class WordSplitterTest {
    @Test
    void shouldReturnFrequencyWord() throws FileNotFoundException {
        WordSplitter ws = new WordSplitter();

        assertEquals(33, ws.frequencyWord(WordSplitter.FileReader(), "sherlock"));
        assertEquals(185, ws.frequencyWord(WordSplitter.FileReader(), "holmes"));
        assertEquals(113, ws.frequencyWord(WordSplitter.FileReader(), "watson"));
        assertEquals(111, ws.frequencyWord(WordSplitter.FileReader(), "baskerville"));
    }


    @Test
    void shouldReturnNoExistWord() throws FileNotFoundException {
        WordSplitter ws = new WordSplitter();

        assertEquals(-1, ws.frequencyWord(WordSplitter.FileReader(), "Vladislav"));
    }

    @Test
    void shouldReturnNoWhitespace() throws FileNotFoundException {
        WordSplitter ws = new WordSplitter();

        assertEquals(-1, ws.frequencyWord(WordSplitter.FileReader(), " "));
    }

}
