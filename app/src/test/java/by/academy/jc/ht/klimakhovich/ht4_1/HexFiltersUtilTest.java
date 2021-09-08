package by.academy.jc.ht.klimakhovich.ht4_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HexFiltersUtilTest {

  @Test
  public void deleteHexadecimalNumbers1() {
    assertEquals("akjhsd sag asdf 0b0112 ds",
        HexFiltersUtil.filter("akjhsd 0xFF sag asdf 0b0112 ds"));
  }

  @Test
  public void deleteHexadecimalNumbers2() {
    assertEquals("Look at me", HexFiltersUtil.filter("Look 0xFF at 0x9F me"));
  }

  @Test
  public void deleteHexadecimalNumbers3() {
    assertEquals("Look at me", HexFiltersUtil.filter("Look 0xFF at 0xAFF me"));
  }

  @Test
  public void stringWithoutHexadecimalNumbers() {
    assertEquals("Look at me", HexFiltersUtil.filter("Look at me"));
  }

}