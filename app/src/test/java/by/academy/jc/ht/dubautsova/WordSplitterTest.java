package by.academy.jc.ht.dubautsova;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSplitterTest {

    @Test
    void getAmountOfDiffWordsFromText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("DubautsovaTest.data.txt");
        assertEquals(23,ws.wordCounter.size());
    }

    @Test
    void getFrequencyOfDefiniteWordFromText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("DubautsovaTest.data.txt");
        assertEquals(6, ws.getFrequency("can"));
        assertEquals(2, ws.getFrequency("wood"));
        assertEquals(2, ws.getFrequency("how"));
        assertEquals(2, ws.getFrequency("peter"));
        assertEquals(7, ws.getFrequency("a"));
    }

    @Test
    void getFrequencyOfDefiniteWordNotFromText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("DubautsovaTest.data.txt");
        assertEquals(-1, ws.getFrequency("How"));
        assertEquals(-1, ws.getFrequency("party"));
        assertEquals(-1, ws.getFrequency("woood"));
        assertEquals(-1, ws.getFrequency("pick?"));
        assertEquals(-1, ws.getFrequency("peppers."));
    }

    @Test
    void getTheWordWithMaxFrequencyFromText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("DubautsovaTest.data.txt");
        Map.Entry<String, Integer> expectedEntry = Map.entry("a", 7);
        assertEquals(expectedEntry, ws.getWordWithMaxFrequency());

    }

    @Test
    void getAmountOfDiffWordsFromNLongText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("Dubautsova.data.txt");
        assertEquals(5948,ws.wordCounter.size());
    }

    @Test
    void getFrequencyOfDefiniteWordFromLongText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("Dubautsova.data.txt");
        assertEquals(985, ws.getFrequency("a"));
        assertEquals(1597, ws.getFrequency("the"));
        assertEquals(59, ws.getFrequency("man"));
        assertEquals(25, ws.getFrequency("day"));
        assertEquals(253, ws.getFrequency("you"));
        assertEquals(120, ws.getFrequency("gatsby"));
    }

    @Test
    void getFrequencyOfDefiniteWordNotFromLongText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("Dubautsova.data.txt");
        assertEquals(-1, ws.getFrequency("mango"));
        assertEquals(-1, ws.getFrequency("party!"));
        assertEquals(-1, ws.getFrequency("pillow."));
        assertEquals(-1, ws.getFrequency("Belarus"));
        assertEquals(-1, ws.getFrequency("rainkhjjffd"));
    }

    @Test
    void getTheWordWithMaxFrequencyFromLongText() throws IOException{
        WordSplitter ws = new WordSplitter();
        ws.getWordsFromText("Dubautsova.data.txt");
        Map.Entry<String, Integer> expectedEntry = Map.entry("the", 1597);
        assertEquals(expectedEntry, ws.getWordWithMaxFrequency());

    }

}
