package by.academy.jc.ht.shorokhov.ht10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpyStorageTest {


    @Test
    void shouldCheckNamePersistence() {


        assertFalse(SpyStorage.checkName("fdsdfs"));

        SpyStorage.setInfo("fdsfs");
        assertTrue(SpyStorage.checkName("fdsfs"));
    }

        @Test
        void shouldReturnAmountOfThrows(){


        SpyStorage.setInfo("Tim");
        SpyStorage.setInfo("Tim");
        assertEquals(2,SpyStorage.getAmount("Tim"));

        SpyStorage.setInfo("Abc");
        assertEquals(1,SpyStorage.getAmount("Abc"));

    }



}