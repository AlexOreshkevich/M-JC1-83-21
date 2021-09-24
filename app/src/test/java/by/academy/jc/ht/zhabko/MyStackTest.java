package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void shouldPushAllIntegerObjects() throws RuntimeException {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        assertEquals(5,testObject.peek());
    }

    @Test
    void shouldPushAllStringObjects() throws RuntimeException {
        MyStack <String> testObject = new MyStack<>();
        testObject.push("Test");
        testObject.push("Java");
        testObject.push("Code");
        testObject.push("Implementation");
        testObject.push("MyStack");
        assertEquals("MyStack",testObject.peek());
    }

    @Test
    void shouldPushCorrectNumberOfObjects() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        assertEquals(5,testObject.size());
    }

    @Test
    void shouldPopAndReturnIntegerObject() throws RuntimeException {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        testObject.pop();
        assertEquals(4,testObject.peek());
    }

    @Test
    void shouldPopAndReturnStringObject() throws RuntimeException {
        MyStack <String> testObject = new MyStack<>();
        testObject.push("Test");
        testObject.push("Java");
        testObject.push("Code");
        testObject.push("Implementation");
        testObject.push("MyStack");
        testObject.pop();
        assertEquals("Implementation",testObject.peek());
    }

    @Test
    void shouldReturnTrueOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        assertTrue(testObject.isEmpty());
    }

    @Test
    void shouldReturnFalseOnNonEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        assertFalse(testObject.isEmpty());
    }

    @Test
    void shouldThrowRuntimeExceptionOnPeekOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        Exception exception = assertThrows(EmptyCollectionException.class, testObject::peek);
        String actualMessage = exception.getMessage();
        String expectedMessage = "Current MyStack is empty";
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void shouldThrowRuntimeExceptionOnPoPOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        Exception exception = assertThrows(EmptyCollectionException.class, testObject::pop);
        String actualMessage = exception.getMessage();
        String expectedMessage = "Current MyStack is empty";
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void shouldReturnZeroSumOfStackWithIterator() {
        MyStack <Integer> testObject = new MyStack<>();
        int testSum = 28;
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        testObject.push(6);
        testObject.push(7);

        Iterator <Integer> iterator = testObject.iterator();

        while (iterator.hasNext()) {
            testSum -= iterator.next();
        }
        assertEquals(0,testSum);
    }

    @Test
    void shouldReturnTrueOnFoundNullObject() {
        MyStack <Object> testObject = new MyStack<>();

        testObject.push(123);
        testObject.push("Test string first");
        testObject.push(687);
        testObject.push(645);
        testObject.push("Test string second");
        testObject.push(537);
        testObject.push(null);
        testObject.push(348);

        assertTrue(testObject.contains(null));
    }

    @Test
    void shouldReturnTrueOnFoundIntegerObject() {
        MyStack <Object> testObject = new MyStack<>();

        testObject.push(123);
        testObject.push("Test string first");
        testObject.push(687);
        testObject.push(645);
        testObject.push("Test string second");
        testObject.push(537);
        testObject.push(null);
        testObject.push(348);

        assertTrue(testObject.contains(537));
    }

    @Test
    void shouldReturnTrueOnFoundStringObject() {
        MyStack <Object> testObject = new MyStack<>();

        testObject.push(123);
        testObject.push("Test string first");
        testObject.push(687);
        testObject.push(645);
        testObject.push("Test string second");
        testObject.push(537);
        testObject.push(null);
        testObject.push(348);

        assertTrue(testObject.contains("Test string first"));
    }

    @Test
    void shouldReturnFalseOnUnFoundObject() {
        MyStack <Object> testObject = new MyStack<>();

        testObject.push(123);
        testObject.push("Test string first");
        testObject.push(687);
        testObject.push(645);
        testObject.push("Test string second");
        testObject.push(537);
        testObject.push(348);

        assertFalse(testObject.contains(0));
        assertFalse(testObject.contains("Java"));
        assertFalse(testObject.contains(null));
    }

    @Test
    void shouldAddObject() {
        MyStack <Integer> testObject = new MyStack<>();

        assertTrue(testObject.add(123));
        assertEquals(123,testObject.peek());
    }

    @Test
    void shouldRemoveObject() {
        MyStack <Object> testObject = new MyStack<>();

        testObject.push(123);
        testObject.push("Test string first");
        testObject.push(687);
        testObject.push(645);
        testObject.push("Test string second");
        testObject.push(537);
        testObject.push(null);
        testObject.push(348);

        assertTrue(testObject.remove(null));
        assertTrue(testObject.remove((Object) 537));
        assertTrue(testObject.remove("Test string second"));
        assertFalse(testObject.remove((Object) 0));
        testObject.pop();

        assertEquals(645,testObject.peek());
    }

    @Test
    void shouldConvertToArray() {
        MyStack <Object> testStack = new MyStack<>();
        Object[] objectsArray = {348,null,537,"Test string second",645,687,"Test string first",123};

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        assertArrayEquals(objectsArray,testStack.toArray());
    }

    @Test
    void shouldClearMyStack() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        testStack.clear();

        assertEquals(0,testStack.size());
        Exception exception = assertThrows(EmptyCollectionException.class, testStack::pop);
        String actualMessage = exception.getMessage();
        String expectedMessage = "Current MyStack is empty";
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void shouldReturnIndexOfElementOrMinus1IfNotFound() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        assertEquals(0,testStack.indexOf((Object) 348));
        assertEquals(1,testStack.indexOf(null));
        assertEquals(3,testStack.indexOf("Test string second"));
        assertEquals(-1,testStack.indexOf((Object) 0));
    }

    @Test
    void shouldReturnElementByIndex() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        assertEquals( 348,testStack.get(0));
        assertEquals(null,testStack.get(1));
        assertEquals("Test string second",testStack.get(3));
        assertEquals(123,testStack.get(7));


        //Exception test
        Exception exception = assertThrows(IndexOutOfBoundsException.class,() -> {testStack.get(8);});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Index out of range";
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void shouldSetElementOnIndex() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        //Exception test
        Exception exception = assertThrows(IndexOutOfBoundsException.class,() -> {testStack.get(8);});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Index out of range";
        assertEquals(expectedMessage,actualMessage);



        assertEquals(537,testStack.set(2,204));
        assertEquals(204,testStack.get(2));

        assertEquals(null,testStack.set(1,"String"));
        assertEquals("String",testStack.get(1));
    }

    @Test
    void shouldAddNodeOnIndexPlaceWithOffsetOfOtherNodes() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        //Exception test
        Exception exception = assertThrows(IndexOutOfBoundsException.class,() -> {testStack.get(8);});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Index out of range";
        assertEquals(expectedMessage,actualMessage);


        testStack.add(2,"Test String");
        assertEquals("Test String",testStack.get(2));
        assertEquals(null,testStack.get(1));
        assertEquals(537,testStack.get(3));
    }


    //Not working correct
    @Test
    void shouldRemoveNodeWithOffsetOtherNodes() {
        MyStack <Object> testStack = new MyStack<>();

        testStack.push(123);
        testStack.push("Test string first");
        testStack.push(687);
        testStack.push(645);
        testStack.push("Test string second");
        testStack.push(537);
        testStack.push(null);
        testStack.push(348);

        //Exception test
        Exception exception = assertThrows(IndexOutOfBoundsException.class,() -> {testStack.get(8);});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Index out of range";
        assertEquals(expectedMessage,actualMessage);

        assertEquals(null,testStack.remove(1));
        testStack.remove(1);

        Object[] arr = testStack.toArray();

        for (Object item : arr) {
            System.out.println(item);
        }
    }

    @Test
    void testsOfNotImplementedFunctions() {
        MyStack <Object> testStack = new MyStack<>();
        List <Object> testList = new LinkedList<>();

        assertNull(testStack.listIterator());
        assertNull(testStack.listIterator(1));
        assertNull(testStack.subList(2,3));
        assertFalse(testStack.retainAll(testList));
        assertFalse(testStack.removeAll(testList));
        assertFalse(testStack.containsAll(testList));
        assertFalse(testStack.addAll(testList));
        assertFalse(testStack.addAll(2,testList));
        assertEquals(0,testStack.lastIndexOf((Object) 2));
    }

}
