package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpyStorageTest {


    @Test
    void shouldReturnExceptionClassesWithFrequencies(){

        try {
            throw new SpyException();
        } catch (SpyException e) {


        }
        assertTrue(SpyStorage.getInstance().isContainsClassName("by.academy.jc.ht.zhabko.SpyStorageTest"));
        assertEquals(1,SpyStorage.getInstance().getFrequency("by.academy.jc.ht.zhabko.SpyStorageTest"));

        SpyStorage.getInstance().setInformation("by.academy.jc.ht.zhabko.SpyStorageTest");
        assertTrue(SpyStorage.getInstance().isContainsClassName("by.academy.jc.ht.zhabko.SpyStorageTest"));
        assertEquals(2,SpyStorage.getInstance().getFrequency("by.academy.jc.ht.zhabko.SpyStorageTest"));

    }
}
