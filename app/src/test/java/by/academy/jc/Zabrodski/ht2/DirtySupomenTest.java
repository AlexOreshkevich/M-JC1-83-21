package by.academy.jc.Zabrodski.ht2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DirtySupomenTest {
  @Test
    public void shouldReturnDirtySum() {

      DirtySumopen sum = new DirtySumopen();
      assertEquals(23, sum.result(5, 3));
      assertEquals(13L, sum.result(6L, 1L));
      assertEquals(15.79, sum.result(6.3, 1.3));
    }
}