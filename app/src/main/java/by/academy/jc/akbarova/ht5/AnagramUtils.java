package by.academy.jc.akbarova.ht5;

import java.util.Arrays;

public class AnagramUtils {
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int aLength = a.length();
        int bLength = b.length();

        if (aLength != bLength) {
            return false;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        String firstWord = new String(aArray);
        String secondWord = new String(bArray);

        return firstWord.equals(secondWord);
    }
}
