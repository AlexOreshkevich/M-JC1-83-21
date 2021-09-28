package by.academy.jc.ht.shorokhov.ht12;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordSplitterTest {

    @Test
    void frequency() throws FileNotFoundException {
        WordSplitter buzzy = new WordSplitter();

        //testing existing words
        assertEquals(672,buzzy.frequency(WordSplitter.ListReader(),"tom"));
        assertEquals(372,buzzy.frequency(WordSplitter.ListReader(),"she"));
        assertEquals(758,buzzy.frequency(WordSplitter.ListReader(),"you"));
        assertEquals(146,buzzy.frequency(WordSplitter.ListReader(),"did"));
        assertEquals(237,buzzy.frequency(WordSplitter.ListReader(),"no"));

        //testing no word for throwing "-1"
        assertEquals(-1,buzzy.frequency(WordSplitter.ListReader(),""));

        //testing non-existent word in that input
        assertEquals(-1,buzzy.frequency(WordSplitter.ListReader(),"tesla"));

        //testing whitespace
        assertEquals(-1,buzzy.frequency(WordSplitter.ListReader()," "));
    }
}