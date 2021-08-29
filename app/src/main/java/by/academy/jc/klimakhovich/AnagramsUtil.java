package by.academy.jc.klimakhovich;

import java.util.Arrays;

public class AnagramsUtil {

    public static boolean isAnagram(String a, String b) {

        if ((a.length() != b.length()) ||
                (a.length() > 50) ||
                (b.length() > 50) ||
                ((a.matches("[^a-zA-Z]+")) ||
                        ((b.matches("[^a-zA-Z]+"))))) {
            return false;
        }
        String alc = a.toLowerCase();
        String blc = b.toLowerCase();

        char[] str1 = alc.toCharArray();
        char[] str2 = blc.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        String c1 = new String(str1);
        String c2 = new String(str2);

        return c1.equals(c2);
    }
}