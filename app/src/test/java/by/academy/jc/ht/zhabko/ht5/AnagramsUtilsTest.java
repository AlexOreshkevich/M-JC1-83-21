package by.academy.jc.ht.zhabko.ht5;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class AnagramsUtilsTest {

  private static Stream<Arguments> providingAandBStrings() {
    return Stream.of(
        Arguments.of("anagram", "margana", true),
        Arguments.of("anagramm", "marganaa", false),
        Arguments.of("Hello", "hello", true)
    );
  }

  @ParameterizedTest
  @MethodSource("providingAandBStrings")
  void shouldReturnTrueWhenAandBAnagramsOrFalseWhenNotAnagramsTest(String a, String b,
      boolean result) {
    assertEquals(result, AnagramUtils.isAnagram(a, b));
  }

}
