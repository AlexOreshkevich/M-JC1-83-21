package by.academy.jc.klimakhovich;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestMyClass {

    @Test
    void firstTestClass() {
        MyClass classUnderTest = new MyClass();
        assertNotNull(classUnderTest.greeting(), "MyClass should have a greeting");
    }

}
