package by.academy.jc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramsUtilsTest {

    @Test
    public void testCase1(){
        System.out.println(AnagramsUtils.isAnagram("anagram", "margana"));
    }
    @Test
    public void testCase2(){
        System.out.println(AnagramsUtils.isAnagram("anagramm", "marganaa"));
    }
    @Test
    public void testCase3(){
        System.out.println(AnagramsUtils.isAnagram("Hello", "hello"));
    }

}