package by.academy.jc.lukashevich.ht3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogTest {

  Frog frog = new Frog();

  @Test
  public void jump1() {
    assertEquals(3, frog.jump(0, 6, 2), "return 3");
  }

  @Test
  public void jump2() {
    assertEquals(2, frog.jump(1, 10, 5), "return 2");
  }

  @Test
  public void jump3() {
    assertEquals(1, frog.jump(0, 6, 6), "return 1");
  }
}