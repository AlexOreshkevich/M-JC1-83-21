package by.academy.jc.zhabko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplClockTest {

    @Test
    void shouldReturnCurrentLocalDateTime() {
        SimplClock test = SimplClock.getSimpleClock();
        System.out.println(test.displayTime());
    }


}