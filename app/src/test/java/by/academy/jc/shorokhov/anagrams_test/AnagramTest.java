package by.academy.jc.shorokhov.anagrams_test;
import by.academy.jc.shorokhov.anagrams.AnagramUtils;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    AnagramUtils test = new AnagramUtils();
    @Test
    void CompareOurAnagrams() {
        assertEquals(true, test.isAnagram("anagram", "margana") );
    }
    @Test
    void CompareOurAnagrams1() {
        assertEquals(false, test.isAnagram("anagramm", "marganaa") );
    }
    @Test
    void CompareOurAnagrams2() {
        assertEquals(true, test.isAnagram("Hello", "hello") );
    }
    @Test
    void CompareOurAnagrams3() {
        assertEquals(false, test.isAnagram("Heello", "heelo") );
    }
    @Test
    void CompareOurAnagrams4() {
        assertEquals(true, test.isAnagram("anaggram", "marggana") );
    }
    @Test
    void CompareOurAnagrams5() {
        assertEquals(true, test.isAnagram("Java excellent", "java EXCELLENT") );
    }
}
