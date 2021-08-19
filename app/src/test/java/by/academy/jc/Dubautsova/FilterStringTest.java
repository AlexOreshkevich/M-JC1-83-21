package by.academy.jc.Dubautsova;

import by.academy.jc.dubautsova.FilterString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterStringTest {
    @Test
    public void shouldRemoveTags(){
        assertEquals("Hello, world!", FilterString.filterContent("<h1>Hello, world!</h1>"));
        assertEquals("Hello, world!!", FilterString.filterContent("<h1><p>Hello, world!!</p></h1>"));
        assertEquals("Hello, world!!!", FilterString.filterContent("<p>Hello, world!!!</p>"));
    }
}
