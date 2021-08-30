package by.academy.jc.zaikouskaya;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HexFilterTest {

    @Test
    public void deleteHexadecimalNumbers0(){
        assertEquals("nsrt siwqnm  gkj", HexFilter.filter("nsrt siwqnm 0xABCD gkj"));
    }

}