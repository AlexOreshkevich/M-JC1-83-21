package by.academy.jc.ht.shorokhov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DirtyTest {

  DirtyUtils calculator = new DirtyUtils();

  @Test
  public void testSumInt() {

    assertEquals(11, DirtyUtils.sum(1, 5), " is equal sumInt ");
  }

  @Test
  public void testSumDouble() {

    assertEquals(32.75, DirtyUtils.sum(6.5, 3.5), " is equal sumDouble ");
  }
}
