package by.academy.jc.ht.klimakhovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    @Test
    void shouldReturnCheck() {
        Storage.setInformation("Name1");
        assertTrue(Storage.check("Name1"));
    }

    @Test
    void shouldReturnAmountOfThrows() {
        Storage.setInformation("Name1");
        assertEquals(1, Storage.amountOfThrows("Name1"));
        Storage.setInformation("Name2");
        Storage.setInformation("Name2");
        assertEquals(2, Storage.amountOfThrows("Name2"));
        Storage.setInformation("Name3");
        Storage.setInformation("Name3");
        Storage.setInformation("Name3");
        assertEquals(3, Storage.amountOfThrows("Name3"));
    }

}