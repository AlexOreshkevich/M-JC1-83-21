package by.academy.jc.klimakhovich_ht4_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HexFiltersTest {

    @Test
    public void deleteHexadecimalNumbers1(){
        assertEquals("akjhsd sag asdf 0b0112 ds", HexFilters.filter("akjhsd 0xFF sag asdf 0b0112 ds"));
    }
    @Test
    public void deleteHexadecimalNumbers2(){
        assertEquals("Look at me", HexFilters.filter("Look 0xFF at 0x9F me"));
    }
    @Test
    public void deleteHexadecimalNumbers3(){
        assertEquals("Look at me", HexFilters.filter("Look 0xFF at 0xAFF me"));
    }

}