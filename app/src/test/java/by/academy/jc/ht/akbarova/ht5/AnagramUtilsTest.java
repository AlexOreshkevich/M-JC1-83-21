package by.academy.jc.ht.akbarova.ht5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AnagramUtilsTest {

  private static Stream<Arguments> stringAandBProvider() {
    return Stream.of(
        Arguments.of("anagram", "margana", true),
        Arguments.of("anagramm", "marganaa", false),
        Arguments.of("Hello", "hello", true)
    );
  }

  @ParameterizedTest
  @MethodSource("stringAandBProvider")
  void shouldReturnTrueWhenAandBAnagramsOrFalseWhenNotAnagramsTest(String a, String b,
      boolean result) {
    assertEquals(result, AnagramUtils.isAnagram(a, b));
  }
}
