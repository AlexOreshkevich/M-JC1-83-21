package by.academy.jc.ht.sergeichik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSolitaireTest {


    @Test
    void resultTheSumOfTheNumbers (){

        int[] A = {1, -2, 0, 9, -1, -2};
        assertEquals(8,NumberSolitaire.solution(A));

    }

    @Test
    void resultTheSumOfTheNumbers1 (){

        int[] A = {9, 7, -1, -8, -4, -2};
        assertEquals(14,NumberSolitaire.solution(A));

    }

    @Test
    void resultTheSumOfTheNumbers2 (){

        int[] A = {0, -9, 1, 6, 7, -5};
        assertEquals(9,NumberSolitaire.solution(A));

    }
}
