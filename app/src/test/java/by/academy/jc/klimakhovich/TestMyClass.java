package by.academy.jc.klimakhovich;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestMyClass {

    @Test
    void GreetingTest () {
        MyClass classUnderTest = new MyClass();
        assertNotNull(classUnderTest.get_Greeting(), "app should have a greeting");
    }

}
