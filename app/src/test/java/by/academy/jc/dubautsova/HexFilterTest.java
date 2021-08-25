package by.academy.jc.dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexFilterTest {
    @Test
    public void shouldDeleteHexNumbers(){
        assertEquals("Hello  world without hex :)", HexFilter.withoutHexNumbers("Hello 0xFF world without hex :)"));
    }
    @Test
    public void shouldDeleteHexNumbers1(){
        assertEquals("akfgh  0b345dt gyjjj", HexFilter.withoutHexNumbers("akfgh 0XAB 0b345dt gyjjj"));
    }
    @Test
    public void shouldDeleteHexNumbers2(){
        assertEquals("hjgj hjkd 43roi4 jeejf", HexFilter.withoutHexNumbers("hjgj hjkd 43roi4 jeejf"));
    }
    @Test
    public void shouldDeleteHexNumbers3(){
        assertEquals("  ", HexFilter.withoutHexNumbers("0xFFD 0XA5 0X4C5"));
    }
    @Test
    public void shouldDeleteHexNumbers4(){
        assertEquals("567 688968 765FGUYF 67656ACD", HexFilter.withoutHexNumbers("567 688968 765FGUYF 67656ACD"));
    }
    @Test
    public void shouldDeleteHexNumbers5(){
        assertEquals("Hex", HexFilter.withoutHexNumbers("Hex0X5AC3"));
    }
}
