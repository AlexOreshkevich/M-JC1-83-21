package by.academy.jc.ht.dubautsova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogTest {

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget1() {
    assertEquals(1, Frog.solution(2, 30, 60));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget0() {
    assertEquals(0, Frog.solution(70, 38, 4));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget370667() {
    assertEquals(370667, Frog.solution(988880000, 1000000000, 30));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget00() {
    assertEquals(0, Frog.solution(7, 1000000007, 30));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget000() {
    assertEquals(0, Frog.solution(-83, 50, 6));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget5() {
    assertEquals(5, Frog.solution(450, 5000, 1000));
  }

  @Test
  public void shouldReturnMinNumberOfJumpsForReachingTheTarget3() {
    assertEquals(3, Frog.solution(1, 31, 10));
  }
}
