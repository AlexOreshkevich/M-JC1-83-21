package by.academy.jc.ht.zabrodsky;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HexFilterUtilsTest {

  @Test
  public void deletesHexadecimalNumbers1() {
    assertEquals("akjhsd sag asdf 0b0112 ds",
        HexFilterUtils.hexFilter("akjhsd 0xFF sag asdf 0b0112 ds"));
  }

  @Test
  public void deletesHexadecimalNumbers2() {
    assertEquals("akjhsd sag 0b0112 ds",
        HexFilterUtils.hexFilter("akjhsd 0xFF sag 0xF8 0b0112 ds"));
  }
}
