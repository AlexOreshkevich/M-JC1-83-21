package by.academy.jc.sergeichik;

import by.academy.jc.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexFilterTest {
    @Test
    public void StringWithoutHex() {
        HexFilter underTest = new HexFilter();
        assertEquals("akjhsd sag asdf 0b0112 ds", underTest.filter("akjhsd 0xFF sag asdf 0b0112 ds"));
}
    @Test
    public void StringWithoutHex0() {
        HexFilter underTest = new HexFilter();
        assertEquals("Text without hexadecimal numbers", underTest.filter("Text without 0x324C hexadecimal 0X180AC numbers0X55e "));
    }
    @Test
    public void StringWithoutHex1() {
        HexFilter underTest = new HexFilter();
        assertEquals(" akjhsd ", underTest.filter(" 0X0000007f akjhsd 0xFF "));
    }
}