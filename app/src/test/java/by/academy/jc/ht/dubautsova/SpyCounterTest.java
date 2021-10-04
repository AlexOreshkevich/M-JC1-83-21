package by.academy.jc.ht.dubautsova;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpyCounterTest {
    public static class ClassWithExc {
        public static void methodWithExc() {
            new SpyException("gjg1");
            new SpyException("hj2");
        }
    }


    public static class ClassWithExc2{
        public static void methodWithExc2() {
            new SpyException("ktftk3");
        }
    }

        @Test
        void shouldReturnCounter() {
        ClassWithExc.methodWithExc();
            assertEquals(1, SpyCounter.entries.size());
        }

    @Test
    void shouldReturnCounter2() {
        ClassWithExc.methodWithExc();
        ClassWithExc2.methodWithExc2();
        assertEquals(2, SpyCounter.entries.size());
    }

    @Test
    void shouldReturnCounter3() {
        ClassWithExc.methodWithExc();
        ClassWithExc.methodWithExc();
        ClassWithExc2.methodWithExc2();
        ClassWithExc.methodWithExc();
        assertEquals(2, SpyCounter.entries.size());
    }


}
