package by.academy.jc.ht.akbarova.ht8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    @Test
    void shouldReturnNumberOfFishWitchStayAlive() {
        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        assertEquals(2, fish.solution(A, B));
    }

    @Test
    void shouldReturnNumberOfFishWitchStayAlive2() {
        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5, 1};
        int[] B = {0, 1, 0, 0, 0, 1};
        assertEquals(3, fish.solution(A, B));
    }
}