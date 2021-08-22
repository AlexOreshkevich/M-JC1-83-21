package by.academy.jc.Zabrodski;

import java.util.Arrays;

public class Anagrams {
  public static boolean isAnagram(String a, String b) {

    if ((a.length() != b.length()) || (a.length() > 50) || (b.length() > 50)) return false;

    a = a.toLowerCase();
    b = b.toLowerCase();

    char[] charArray1 = a.toCharArray();
    char[] charArray2 = b.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    String sortedString1 = new String(charArray1);
    String sortedString2 = new String(charArray2);

    boolean result = sortedString1.equalsIgnoreCase(sortedString2);

    return result;
  }

}
