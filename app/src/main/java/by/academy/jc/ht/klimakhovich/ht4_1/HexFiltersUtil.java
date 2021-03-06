package by.academy.jc.ht.klimakhovich.ht4_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexFiltersUtil {

  public static String filter(String source) {

    String number16 = " 0[xX][0-9a-fA-F]+";

    Pattern pattern = Pattern.compile(number16);
    Matcher matcher = pattern.matcher(source);

    String result = source;

    while (matcher.find()) {
      result = result.replaceAll(matcher.group(), "");

    }
    return result;
  }
}