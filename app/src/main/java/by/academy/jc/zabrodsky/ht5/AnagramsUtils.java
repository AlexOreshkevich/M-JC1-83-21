package by.academy.jc.zabrodsky.ht5;

import java.util.Arrays;

public class AnagramsUtils {
  public static boolean isAnagram(String a, String b) {

    if (a.length() != b.length()) return false;

    char[] charArray1 = a.toLowerCase().toCharArray();
    char[] charArray2 = b.toLowerCase().toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    String sortedString1 = new String(charArray1);
    String sortedString2 = new String(charArray2);

    boolean result = sortedString1.equalsIgnoreCase(sortedString2);

    return result;
  }
}
