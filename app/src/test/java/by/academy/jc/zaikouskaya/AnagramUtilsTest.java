package by.academy.jc.zaikouskaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramUtilsTest {
    @Test
    public void test0() {
        assertTrue(AnagramUtils.isAnagram("anagram", "margana"));
    }

    @Test
    public void test1() {
        assertFalse(AnagramUtils.isAnagram("anagramm", "marganaa"));
    }

    @Test
    public void test2() {
        assertTrue(AnagramUtils.isAnagram("Hello", "hello"));
    }

    @Test
    public void test3() {
        assertTrue(AnagramUtils.isAnagram("anagram", "MarGana"));
    }

    @Test
    public void test4() {
        assertTrue(AnagramUtils.isAnagram("Cat", "Act"));
    }

    @Test
    public void test5() {
        assertFalse(AnagramUtils.isAnagram("Car", "Cat"));
    }

}