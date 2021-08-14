package dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogTest {
    @Test
    public void shouldReturnMinNumberOfJumpsForReachingTheTarget() {
        assertEquals(1, Frog.solution(2, 30, 60));
        assertEquals(0, Frog.solution(70, 38, 4));
        assertEquals(370667, Frog.solution(988880000, 1000000000, 30));
        assertEquals(0, Frog.solution(7, 1000000008, 30));
        assertEquals(0, Frog.solution(-80, 50, 4));
        assertEquals(5, Frog.solution(450, 5000, 1000));
        assertEquals(3, Frog.solution(1, 31, 10));
    }
}
