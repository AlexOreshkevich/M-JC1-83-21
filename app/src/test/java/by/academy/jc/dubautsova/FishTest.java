package by.academy.jc.dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishTest {
    @Test
    void shouldReturnNumberOfFishesSurvived1() {
        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        assertEquals(2, fish.solution(A, B));
    }

    @Test
    void shouldReturnNumberOfFishesSurvived2() {
        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5, 1};
        int[] B = {0, 1, 0, 0, 0, 1};
        assertEquals(3, fish.solution(A, B));
    }

    @Test
    void shouldReturnNumberOfFishesSurvived3() {
        Fish fish = new Fish();
        int[] A = {4, 7, 2, 8, 5};
        int[] B = {1, 1, 0, 1, 0};
        assertEquals(3, fish.solution(A, B));
    }

    @Test
    void shouldReturnNumberOfFishesSurvived4() {
        Fish fish = new Fish();
        int[] A = {3, 2, 1};
        int[] B = {1, 0, 0};
        assertEquals(1, fish.solution(A, B));
    }
}
