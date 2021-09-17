package by.academy.jc.ht.zhabko;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FishSolutionTest {

    @ParameterizedTest
    @MethodSource("fishTest")
    void shouldReturnNumberOfFish (int[] A, int[] B, int fish) {
        FishSolution test = new FishSolution();
        assertEquals(fish,test.solution(A,B));
    }

    private static Stream <Arguments> fishTest() {

        //Base test
        int[] A1 = {4,3,2,1,5};
        int[] B1 = {0,1,0,0,0};
        int fish1 = 2;

        //Two fishes without intersections
        int[] A2 = {4,3};
        int[] B2 = {0,1};
        int fish2 = 2;

        //Two fishes with intersections
        int[] A3 = {4,3};
        int[] B3 = {1,0};
        int fish3 = 1;

        //Two fishes moving in same direction
        int[] A4 = {4,3};
        int[] B4 = {1,1};
        int fish4 = 2;

        //Two fishes moving in same direction
        int[] A5 = {4,3};
        int[] B5 = {0,0};
        int fish5 = 2;

        //Single fish test
        int[] A6 = {4};
        int[] B6 = {0};
        int fish6 = 1;

        return Stream.of(
                Arguments.of(A1,B1,fish1),
                Arguments.of(A2,B2,fish2),
                Arguments.of(A3,B3,fish3),
                Arguments.of(A4,B4,fish4),
                Arguments.of(A5,B5,fish5),
                Arguments.of(A6,B6,fish6)
        );
    }

}