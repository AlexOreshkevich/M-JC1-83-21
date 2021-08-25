package by.academy.jc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HexFilterTest {

    @Test
    public void deleteHex1(){
        System.out.println(HexFilter.hexFilt("akjhsd 0xFF sag asdfsdf 0b0112 ds"));
    }
    @Test
    public void deleteHex2() {
        System.out.println(HexFilter.hexFilt("aksd 0xB5 sag asfffff 0b0112 dffs"));
    }
    @Test
    public void deleteHex3() {
        System.out.println(HexFilter.hexFilt("sd 0xA1 sag afdsfdsdf 0b0112 dsfdsf"));
    }


}