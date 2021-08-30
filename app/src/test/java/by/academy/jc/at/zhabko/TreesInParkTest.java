package by.academy.jc.at.zhabko;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TreesInParkTest {

    @ParameterizedTest
    @MethodSource("inputArrays")

    void shouldReturnSortedArray(int[] input,int[] output){
        TreesInPark testObject = new TreesInPark();
        assertArrayEquals(output,testObject.sortByHeight(input));
    }

    private static Stream<Arguments> inputArrays(){

        int[] i1 = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] o1 = {-1, 150, 160, 170, -1, -1, 180, 190};

        int[] i2 = {-1, -1, -1, -1, -1};
        int[] o2 = {-1, -1, -1, -1, -1};

        int[] i3 = {-1};
        int[] o3 = {-1};

        int[] i4 = {4, 2, 9, 11, 2, 16};
        int[] o4 = {2, 2, 4, 9, 11, 16};

        int[] i5 = {2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
        int[] o5 = {1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2};

        int[] i6 = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
        int[] o6 = {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};

        return Stream.of(
                Arguments.of(i1,o1),
                Arguments.of(i2,o2),
                Arguments.of(i3,o3),
                Arguments.of(i4,o4),
                Arguments.of(i5,o5),
                Arguments.of(i6,o6)
        );
    }
}
