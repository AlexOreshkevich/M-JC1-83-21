package by.academy.jc.Zabrodski;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution sol = new Solution();

  @Test
  public void shouldReturnNumberOfJumps() {
    assertEquals(3, sol.solution(10, 85, 30));
  }

}
