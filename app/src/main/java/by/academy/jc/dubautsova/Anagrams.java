package by.academy.jc.dubautsova;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class Anagrams {

    public static String isAnagram(String a, String b){
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char[] chA1 = a1.toCharArray();
        char[] chB1 = b1.toCharArray();
        sort(chA1);
        sort(chB1);
        if (Arrays.equals(chA1, chB1)) return "Anagrams";
        else return "Not Anagrams";
    }
}
