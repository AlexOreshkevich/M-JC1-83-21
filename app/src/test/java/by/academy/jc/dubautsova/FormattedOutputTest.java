package by.academy.jc.dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormattedOutputTest {
    @Test
    public void shouldReturnFormattedNumber100000000(){
        assertEquals("100 000 000", FormattedOutput.formattedNumber(100000000));
    }
    @Test
    public void shouldReturnFormattedNumber1234567(){
        assertEquals("1 234 567", FormattedOutput.formattedNumber(1234567));
    }
    @Test
    public void shouldReturnFormattedNumber789(){
        assertEquals("789", FormattedOutput.formattedNumber(789));
    }
    @Test
    public void shouldReturnFormattedNumber1(){
        assertEquals("1", FormattedOutput.formattedNumber(1));
    }
    @Test
    public void shouldReturnFormattedNumber99(){
        assertEquals("99", FormattedOutput.formattedNumber(99));
    }
    @Test
    public void shouldReturnFormattedNumber5687(){
        assertEquals("5 687", FormattedOutput.formattedNumber(5687));
    }
    @Test
    public void shouldReturnFormattedNumber56467(){
        assertEquals("56 467", FormattedOutput.formattedNumber(56467));
    }
    @Test
    public void shouldReturnFormattedNumber356678(){
        assertEquals("356 678", FormattedOutput.formattedNumber(356678));
    }
    @Test
    public void shouldReturnFormattedNumber20023143(){
        assertEquals("20 023 143", FormattedOutput.formattedNumber(20023143));
    }
}
