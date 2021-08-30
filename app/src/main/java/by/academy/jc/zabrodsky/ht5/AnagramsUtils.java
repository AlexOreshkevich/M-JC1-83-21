package by.academy.jc.zabrodsky.ht5;

import java.util.Arrays;

public class AnagramsUtils {

  public static boolean isAnagram(String a, String b) {

    if ((a.length() != b.length()) || (a.length() > 50) || (b.length() > 50)) {
      return false;
    }

    char[] charArray1 = a.toLowerCase().toCharArray();
    char[] charArray2 = b.toLowerCase().toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    String sortedString1 = new String(charArray1);
    String sortedString2 = new String(charArray2);

    return sortedString1.equalsIgnoreCase(sortedString2);
  }
}
