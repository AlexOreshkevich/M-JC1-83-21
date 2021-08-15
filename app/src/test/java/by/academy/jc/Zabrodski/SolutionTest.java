package by.academy.jc.Zabrodski;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution sol1 = new Solution();
  Solution sol2 = new Solution();

  @Test
  public void shouldReturnNumberOfJumps1() {
    assertEquals(3, sol1.solution1(10, 85, 30));
  }

  @Test
  public void shouldReturnNumberOfJumps2() {
    assertEquals(22222221, sol2.solution2(65, 1000000000, 45));
  }

}
