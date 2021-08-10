package by.academy.jc.zhabko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyClassTest {
    @Test
    void appHasAGreeting() {
        MyClass testHW1 = new MyClass();
        assertNotNull(testHW1.getHW(), "MyClass has returned Hello World");
    }
}
