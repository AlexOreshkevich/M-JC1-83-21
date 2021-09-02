package by.academy.jc.ht.akbarova.ht5;

import java.util.Arrays;

public class AnagramUtils {

  public static boolean isAnagram(String a, String b) {
    String one = a.toLowerCase();
    String two = b.toLowerCase();

    int aLength = one.length();
    int bLength = two.length();

    if (aLength != bLength) {
      return false;
    }
    char[] aArray = one.toCharArray();
    char[] bArray = two.toCharArray();

    Arrays.sort(aArray);
    Arrays.sort(bArray);

    String firstWord = new String(aArray);
    String secondWord = new String(bArray);

    return firstWord.equals(secondWord);
  }
}
