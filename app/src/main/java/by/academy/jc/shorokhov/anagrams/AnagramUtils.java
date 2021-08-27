package by.academy.jc.shorokhov.anagrams;
import java.util.Arrays;

public class AnagramUtils {
   public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        for (int i = 0; i < ac.length; ++i) {
            if (ac[i] != bc[i]) {
                return false;
            }
        }
        return true;
    }
}
