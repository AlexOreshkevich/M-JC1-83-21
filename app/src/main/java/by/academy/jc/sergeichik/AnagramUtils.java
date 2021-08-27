package by.academy.jc.sergeichik;


import java.util.Arrays;

public class AnagramUtils {
    public static boolean isAnagram(String a, String b) {
        char[]a1 = a.toLowerCase().toCharArray();
        char[]b1 = b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        boolean res = Arrays.equals(a1, b1);
        return res;
    }
}
