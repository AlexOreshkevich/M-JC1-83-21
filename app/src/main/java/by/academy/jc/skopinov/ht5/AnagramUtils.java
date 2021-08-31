package by.academy.jc.skopinov.ht5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnagramUtils {

  public static boolean isAnagram(String a, String b) {
    if (a.length() > 50 || b.length() > 50)
      throw new IllegalArgumentException();
    Pattern pattern = Pattern.compile("[.[^a-zA-Z]]+?");
    Matcher matcherA = pattern.matcher(a);
    Matcher matcherB = pattern.matcher(b);
    if (matcherA.find() || matcherB.find())
      throw new IllegalArgumentException();

    String aLowerCase = a.toLowerCase();
    String bLowerCase = b.toLowerCase();
    ArrayList<Character> aArray = new ArrayList<>();
    ArrayList<Character> bArray = new ArrayList<>();
    for (char c : aLowerCase.toCharArray()) {
      aArray.add(c);
    }
    for (char c : bLowerCase.toCharArray()) {
      bArray.add(c);
    }
    Collections.sort(aArray);
    Collections.sort(bArray);

    StringBuilder a1 = new StringBuilder();
    for (char c : aArray) {
      a1.append(c);
    }
    StringBuilder b1 = new StringBuilder();
    for (char c : bArray) {
      b1.append(c);
    }
    String sortedALowerCase = a1.toString();
    String sortedBLowerCase = b1.toString();

    return sortedALowerCase.equals(sortedBLowerCase);
  }
}
