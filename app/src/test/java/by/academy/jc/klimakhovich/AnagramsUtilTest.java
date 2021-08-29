package by.academy.jc.klimakhovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramsUtilTest {
    AnagramsUtil classUnderTest = new AnagramsUtil();

    @Test
    void test1() {
        assertEquals(true, AnagramsUtil.isAnagram("anagram", "margana"));
    }

    @Test
    void test2() {
        assertEquals(false, AnagramsUtil.isAnagram("anagramm", "marganaa"));
    }

    @Test
    void test3() {
        assertEquals(true, AnagramsUtil.isAnagram("Hello", "hello"));
    }

    @Test
    void test4() {
        assertEquals(true, AnagramsUtil.isAnagram("anagram", "MarGana"));
    }

    @Test
    void test5() {
        assertEquals(true, AnagramsUtil.isAnagram("catana", "AtCNaA"));
    }

    @Test
    void shouldReturnFalse50DifferentLetters() {
        assertEquals(false, AnagramsUtil.isAnagram("ajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlso", "AtCNaAasdfAtCNaAasdfAtCNaAasdfAtCNaAasdfAtCNaAasdf"));
    }

    @Test
    void shouldReturnTrue50SameLetters() {
        assertEquals(true, AnagramsUtil.isAnagram("ajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlso", "ajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlso"));
    }

    @Test
    void shouldReturnFalse51SameLetters() {
        assertEquals(false, AnagramsUtil.isAnagram("ajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoq", "ajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoajfmvkdlsoq"));
    }
}