package by.academy.jc.zabrodsky;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexFilterUtils {

  public static String hexFilter(String line) {

    String pattern = " 0[xX][\\da-fA-F]+";
    Pattern p = Pattern.compile(pattern);

    Matcher m = p.matcher(line);
    String str = line;

    while (m.find()) {
      str = str.replaceAll(m.group(), "");
    }

    return str;
  }
}


