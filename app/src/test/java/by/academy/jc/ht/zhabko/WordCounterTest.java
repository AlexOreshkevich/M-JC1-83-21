package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest {


    //Testing of suffix removal by Porter Stemmer Algorithm
    @Test
    void shouldReturnRootFormOfWord() {
        WordCounter test = new WordCounter();


        assertEquals("caress",test.getRootWord("Caresses"));
        assertEquals("poni",test.getRootWord("ponies"));
        assertEquals("ti",test.getRootWord("ties"));
        assertEquals("cat",test.getRootWord("cats"));


        assertEquals("agr",test.getRootWord("Agreed"));
        assertEquals("feed",test.getRootWord("FEed"));


        assertEquals("plaster",test.getRootWord("plastered"));
        assertEquals("bled",test.getRootWord("bled"));


        assertEquals("motor",test.getRootWord("motoring"));
        assertEquals("sing",test.getRootWord("sing"));


        assertEquals("conflat",test.getRootWord("conflated"));
        assertEquals("troubl",test.getRootWord("troubling"));


        assertEquals("hop",test.getRootWord("hopping"));
        assertEquals("tan",test.getRootWord("tanned"));
        assertEquals("fal",test.getRootWord("falling"));


        assertEquals("fil",test.getRootWord("filing"));
        assertEquals("fail",test.getRootWord("fail"));


        assertEquals("happi",test.getRootWord("happy"));
        assertEquals("sky",test.getRootWord("sky"));


        assertEquals("relat",test.getRootWord("relational"));
        assertEquals("generaliz",test.getRootWord("generalization"));
        assertEquals("sensibl",test.getRootWord("sensibiliti"));


        assertEquals("triplic",test.getRootWord("triplicate"));
        assertEquals("hop",test.getRootWord("hopeful"));
        assertEquals("good",test.getRootWord("goodness"));


        assertEquals("allow",test.getRootWord("allowance"));
        assertEquals("depend",test.getRootWord("dependent"));
        assertEquals("effect",test.getRootWord("effective"));


        assertEquals("probat",test.getRootWord("probate"));
        assertEquals("good",test.getRootWord("goodness"));


        assertEquals("control",test.getRootWord("controll"));
        assertEquals("roll",test.getRootWord("roll"));
    }

    @Test
    void shouldReturnFrequencyIfContains() throws IOException {
        WordCounter test = new WordCounter();
        test.countWord();
        assertEquals(128,test.getFrequency("upon"));
        assertEquals(-1,test.getFrequency("abrahabra"));
    }

    @Test
    void shouldCreateTreeMapOfWorsd() throws IOException {
        WordCounter test = new WordCounter();
        test.countWord();
        assertTrue(test.isContains("upon"));
        assertEquals(128,test.getFrequency("upon"));
    }

    @Test
    void shouldReturnTrueOnVovelAndFalseOnConstrant() {
        WordCounter test = new WordCounter();
        assertTrue(test.isVowel('a'));
        assertFalse(test.isVowel('b'));
    }

    @Test
    void shouldReturnTrueOnContainsVowelAndFalseOnNot() {
        WordCounter test = new WordCounter();
        assertTrue(test.containsVowel("fod"));
        assertFalse(test.containsVowel("fdd"));
    }

    @Test
    void shouldReturnTrueOnCVCEndingAndFalseOnNot() {
        WordCounter test = new WordCounter();
        assertTrue(test.isCVC("turned"));
        assertFalse(test.isCVC("turnwd)"));
    }
}
