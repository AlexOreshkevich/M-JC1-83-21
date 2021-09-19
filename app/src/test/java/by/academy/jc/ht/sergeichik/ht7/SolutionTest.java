package by.academy.jc.ht.sergeichik.ht7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class SolutionTest {


    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    Stream<Arguments> solTest(String role, int spend, int left) {
        Solution solution = new Solution();
        Assertions.assertEquals(spend, left);

        private static Stream <Arguments> provideStringsForIsBlank(){
            return Stream.of(
                    Arguments.of("SENIOR", 75, 100),
                    Arguments.of("JUNIOR", 45, 50),
                    Arguments.of("SENIOR", 40, 100)
            );
        }
    }
}

