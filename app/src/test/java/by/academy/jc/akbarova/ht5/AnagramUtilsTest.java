package by.academy.jc.akbarova.ht5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramUtilsTest {

    @ParameterizedTest
    @MethodSource("stringA_and_BProvider")
    void shouldReturnTrueWhenAandBAnagramsOrFalseWhenNotAnagramsTest (String a, String b, boolean result) {
        assertEquals(result, by.academy.jc.akbarova.ht5.AnagramUtils.isAnagram(a,b));
    }

    private static Stream<Arguments> stringA_and_BProvider() {
        return Stream.of(
                Arguments.of("anagram","margana",true),
                Arguments.of("anagramm","marganaa",false),
                Arguments.of("Hello","hello",true)
        );
    }
}