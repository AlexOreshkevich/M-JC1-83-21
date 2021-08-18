package by.academy.jc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper class to support exploration of regular expression constructs.
 *
 * @author Aliaksandr Arashkevich
 */
public class RegexHelper {

  /**
   * Compiles #regex and tries to find any match in #source. Display's them to System.out, if any.
   *
   * @param regex  the expression to be compiled
   * @param source the character sequence to be matched
   */
  public static void displayMatches(String regex, String source) {

    // verify input arguments first
    if (regex == null || regex.isBlank()) {
      throw new IllegalArgumentException("Missing required `regex` parameter");
    }

    if (source == null || source.isBlank()) {
      throw new IllegalArgumentException("Missing required `source` parameter");
    }

    // compile pattern provided as a string representation of regular expression
    Pattern pattern = Pattern.compile(regex);

    // initialize matcher based on the character sequence to be matched
    Matcher matcher = pattern.matcher(source);

    // display separately any match available
    boolean found = false;
    while (matcher.find()) {
      System.out.printf(
          "Found the text \"%s\" starting at index %d and ending at index %d.\n",
          matcher.group(),
          matcher.start(),
          matcher.end()
      );
      found = true;
    }

    if (!found) {
      System.out.println("No matches found.");
    }
  }
}
