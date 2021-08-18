package by.academy.jc.regex;

import org.junit.jupiter.api.Test;

public class RegexHelperTest {

  @Test
  public void shouldFindStringLiteral() {
    RegexHelper.displayMatches("foo", "foo");
  }

  @Test
  public void shouldFindStringLiteralWithSubsequentMatches() {
    RegexHelper.displayMatches("foo", "foofoofoo");
  }

  @Test
  public void shouldFindStringLiteralUsingMetacharacterDot() {
    RegexHelper.displayMatches("fo.", "foo");
  }

  /**
   * Simple Classes
   * <p>
   * In the above examples, the overall match succeeds only when the first letter matches one of the
   * characters defined by the character class.
   */
  @Test
  public void shouldFindMatchesUsingSimpleCharacterClass() {
    RegexHelper.displayMatches("[bcr]at", "bat");
    RegexHelper.displayMatches("[bcr]at", "cat");
    RegexHelper.displayMatches("[bcr]at", "rat");
    RegexHelper.displayMatches("[bcr]at", "hat");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassWithNegation() {
    RegexHelper.displayMatches("[^bcr]at", "bat");
    RegexHelper.displayMatches("[^bcr]at", "cat");
    RegexHelper.displayMatches("[^bcr]at", "rat");
    RegexHelper.displayMatches("[^bcr]at", "hat");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassWithRanges() {
    RegexHelper.displayMatches("[a-c]", "a");
    RegexHelper.displayMatches("[a-c]", "b");
    RegexHelper.displayMatches("[a-c]", "c");
    RegexHelper.displayMatches("[a-c]", "d");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassWithRanges2() {
    RegexHelper.displayMatches("foo[1-5]", "foo1");
    RegexHelper.displayMatches("foo[1-5]", "foo2");
    RegexHelper.displayMatches("foo[1-5]", "foo4");
    RegexHelper.displayMatches("foo[1-5]", "foo5");
    RegexHelper.displayMatches("foo[1-5]", "foo6");
    RegexHelper.displayMatches("foo[^1-5]", "foo5");
    RegexHelper.displayMatches("foo[^1-5]", "foo6");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassWithUnions() {
    RegexHelper.displayMatches("[0-4[6-8]]", "0");
    RegexHelper.displayMatches("[0-4[6-8]]", "5");
    RegexHelper.displayMatches("[0-4[6-8]]", "6");
    RegexHelper.displayMatches("[0-4[6-8]]", "8");
    RegexHelper.displayMatches("[0-4[6-8]]", "9");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassUsingIntersections() {
    RegexHelper.displayMatches("[0-9&&[345]]", "3");
    RegexHelper.displayMatches("[0-9&&[345]]", "4");
    RegexHelper.displayMatches("[0-9&&[345]]", "5");
    RegexHelper.displayMatches("[0-9&&[345]]", "2");
    RegexHelper.displayMatches("[0-9&&[345]]", "6");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassUsingIntersectionsTwoRanges() {
    RegexHelper.displayMatches("[2-8&&[4-6]]", "3");
    RegexHelper.displayMatches("[2-8&&[4-6]]", "4");
    RegexHelper.displayMatches("[2-8&&[4-6]]", "5");
    RegexHelper.displayMatches("[2-8&&[4-6]]", "2");
    RegexHelper.displayMatches("[2-8&&[4-6]]", "6");
  }

  @Test
  public void shouldFindMatchesUsingSimpleCharacterClassUsingSubtraction() {
    RegexHelper.displayMatches("[0-9&&[^345]]", "2");
    RegexHelper.displayMatches("[0-9&&[^345]]", "3");
    RegexHelper.displayMatches("[0-9&&[^345]]", "4");
    RegexHelper.displayMatches("[0-9&&[^345]]", "5");
    RegexHelper.displayMatches("[0-9&&[^345]]", "6");
    RegexHelper.displayMatches("[0-9&&[^345]]", "9");
  }
}