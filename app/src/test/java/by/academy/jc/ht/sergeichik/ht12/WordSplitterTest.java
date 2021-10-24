package by.academy.jc.ht.sergeichik.ht12;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSplitterTest {


    @Test
    void classUnderTest() throws IOException {

        WordSplitter wordSplitter = new WordSplitter();
        wordSplitter.wordCounter();

        assertEquals(44, wordSplitter.frequency("empathy"));
        assertEquals(-1, wordSplitter.frequency("java"));
        assertEquals(140,wordSplitter.frequency("and"));
        assertEquals(61,wordSplitter.frequency("children"));
        assertEquals(15,wordSplitter.frequency("study"));
    }
}