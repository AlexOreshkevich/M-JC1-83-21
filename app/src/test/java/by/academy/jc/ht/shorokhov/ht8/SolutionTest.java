package by.academy.jc.ht.shorokhov.ht8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("aliveFishes")
    void shouldReturnNumberOfFish (int[] A, int[] B, int fish) {
        Solution test = new Solution();
        assertEquals(fish,test.solution(A,B));
    }

    private static Stream <Arguments> aliveFishes() {


        int[] A1 = {0,1,5,3,9};
        int[] B1 = {1,1,0,0,1};
        int fish1 = 3;
        System.out.println("Should be alive three fishes in first testcase : " + fish1);


        int[] A2 = {8,6};
        int[] B2 = {1,0};
        int fish2 = 1;
        System.out.println("Should be alive one fish in second testcase : " + fish2);

        int[] A3 = {9,7};
        int[] B3 = {0,1};
        int fish3 = 2;
        System.out.println("Should be alive two fishes in third testcase : " + fish3);

        int[] A4 = {1,0};
        int[] B4 = {1,1};
        int fish4 = 2;
        System.out.println("Should be alive two fishes in fourth testcase : " + fish4);

        int[] A5 = {5};
        int[] B5 = {1};
        int fish5 = 1;
        System.out.println("Should be alive one fish in five testcase : " + fish5);

        return Stream.of(
                Arguments.of(A1,B1,fish1),
                Arguments.of(A2,B2,fish2),
                Arguments.of(A3,B3,fish3),
                Arguments.of(A4,B4,fish4),
                Arguments.of(A5,B5,fish5));

    }

}
