package by.academy.jc.ht.lukashevich;

import static java.util.Arrays.sort;

import java.util.Arrays;

public class AnagramsUtils {

  public static boolean isAnagram(String a, String b) throws Exception {

    if (a.length() >= 50 || b.length() >= 50) {
      throw new Exception();
    }

    char[] chA1 = a.toLowerCase().toCharArray();
    char[] chB1 = b.toLowerCase().toCharArray();

    sort(chA1);
    sort(chB1);

    return Arrays.equals(chA1, chB1);
  }
}
