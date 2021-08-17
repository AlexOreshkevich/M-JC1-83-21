package by.academy.jc.skopinov.ht3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void random_parameter_values() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(3, test.solution(10,85,30));
  }

  @Test
  void x_and_y_are_equal() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1,1,1000000000));
  }

  @Test
  void x_greater_than_y() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1000000000,1,1));
  }

  @Test
  void distance_is_a_multiple_of_jump_length() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(3, test.solution(100,1000,300));
  }

  @Test
  void extreme_parameter_values1() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1,1,1));
  }

  @Test
  void extreme_parameter_values2() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1000000000,1000000000,1000000000));
  }

  @Test
  void extreme_parameter_values3() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(999999999, test.solution(1,1000000000,1));
  }

  @Test
  void extreme_parameter_values4() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(1, test.solution(1,1000000000,1000000000));
  }



}