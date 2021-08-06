package by.academy.jc.klimakhovich;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestMyClass {

    @Test
    void GreetingTest() {
        MyClass classUnderTest = new MyClass();
        assertNotNull(classUnderTest.Greeting(), "MyClass should have a greeting");
    }

}
