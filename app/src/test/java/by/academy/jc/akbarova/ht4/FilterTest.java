package by.academy.jc.akbarova.ht4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    Filter text = new Filter();

    @Test
    void shouldReturnFilterContent() {
        assertEquals("akjhsd sag asdf 0b0112 ds", text.filterContent("akjhsd 0xFF sag asdf 0b0112 ds"));
    }
}