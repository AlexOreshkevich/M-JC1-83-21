package by.academy.jc.zhabko.ht5;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class AnagramsUtilsTest {

    @ParameterizedTest
    @MethodSource("providingAandBStrings")
    void shouldReturnTrueWhenAandBAnagramsOrFalseWhenNotAnagramsTest (String a, String b, boolean result) {
        assertEquals(result, AnagramUtils.isAnagram(a,b));
    }

    private static Stream<Arguments> providingAandBStrings() {
        return Stream.of(
                Arguments.of("anagram","margana",true),
                Arguments.of("anagramm","marganaa",false),
                Arguments.of("Hello","hello",true)
        );
    }

}
