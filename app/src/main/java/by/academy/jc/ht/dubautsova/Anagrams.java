package by.academy.jc.ht.dubautsova;


import static java.util.Arrays.sort;

import java.util.Arrays;

public class Anagrams {

  public static boolean isAnagram(String a, String b) {
    String a1 = a.toLowerCase();
    String b1 = b.toLowerCase();
    char[] chA1 = a1.toCharArray();
    char[] chB1 = b1.toCharArray();
    sort(chA1);
    sort(chB1);
      if (Arrays.equals(chA1, chB1)) {
          return (Arrays.equals(chA1, chB1));
      } else {
          return false;
      }
  }
}
