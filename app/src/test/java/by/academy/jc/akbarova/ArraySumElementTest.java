package by.academy.jc.akbarova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumElementTest {
    @Test
    void shouldReturnSumOfElements1() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(44, ArraySumElement.sumBetweenMaxMinElement(a));
    }
    @Test
    void shouldReturnSumOfElements2() {
        int[] b = {1, 10, 3, 4, 5, 6, 7, 8, 9, 2};

        assertEquals(0, ArraySumElement.sumBetweenMaxMinElement(b));
    }
    @Test
    void shouldReturnSumOfElements3() {
        int[] c = {1, 10, 98, 2, 15, 100, 3, 8, 9, 2};

        assertEquals(125, ArraySumElement.sumBetweenMaxMinElement(c));
    }
}