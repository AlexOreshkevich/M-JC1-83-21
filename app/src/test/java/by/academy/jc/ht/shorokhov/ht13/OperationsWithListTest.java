package by.academy.jc.ht.shorokhov.ht13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperationsWithListTest {


    @Test
    public void shouldReturnFilteredImmutableSetCollectionWithOneElement() {
        OperationsWithList operationsTest = new OperationsWithList();


        Person person1 = new Person("Бобби", "Шаут", 30);
        Person person2 = new Person("Роззи", "Скотти", 21);
        Person person3 = new Person("Майкл", "Шнидхт", 25);
        Person person4 = new Person("Томми", "Шнорс", 20);



        List<Person> test = new ArrayList<Person>();


        test.add(person1);
        test.add(person2);
        test.add(person3);
        test.add(person4);

        operationsTest.operations(test);



        // collection have only one element "Шнорс"
        assertTrue(operationsTest.operations(test).contains("Шнорс"));
        assertFalse(operationsTest.operations(test).contains("Шнидхт")); // false because of age
        assertFalse(operationsTest.operations(test).contains("Скотти"));
        assertFalse(operationsTest.operations(test).contains("Шаут"));


    }


    @Test
    public void shouldReturnFilteredImmutableSetCollectionWithFourElements() {
        OperationsWithList operationsTest = new OperationsWithList();


        Person person1 = new Person("Бобби", "Шор", 19);
        Person person2 = new Person("Роззи", "Шнов", 18);
        Person person3 = new Person("Майкл", "Борохун", 16);
        Person person4 = new Person("Томми", "Шнорс", 20);



        List<Person> test = new ArrayList<Person>();


        test.add(person1);
        test.add(person2);
        test.add(person3);
        test.add(person4);


        operationsTest.operations(test);


        // collection have all this elements
        assertTrue(operationsTest.operations(test).contains("Шнорс"));
        assertTrue(operationsTest.operations(test).contains("Борохун"));
        assertTrue(operationsTest.operations(test).contains("Шнов"));
        assertTrue(operationsTest.operations(test).contains("Шор"));


    }

    @Test
    public void shouldReturnFalseOnLastSortedElement() {
        OperationsWithList operationsTest = new OperationsWithList();


        Person person1 = new Person("Бобби", "Шор", 19);
        Person person2 = new Person("Роззи", "Шнов", 18);
        Person person3 = new Person("Майкл", "Борохун", 16);
        Person person4 = new Person("Томми", "Шнорс", 20);
        Person person5 = new Person("Томми", "Шнорх", 20);


        List<Person> test = new ArrayList<Person>();


        test.add(person1);
        test.add(person2);
        test.add(person3);
        test.add(person4);
        test.add(person5);

        operationsTest.operations(test);


        // collection have all this elements except "Шор", because limit of collection is 4
        assertTrue(operationsTest.operations(test).contains("Шнорс"));
        assertTrue(operationsTest.operations(test).contains("Борохун"));
        assertTrue(operationsTest.operations(test).contains("Шнов"));
        assertFalse(operationsTest.operations(test).contains("Шор"));
        assertTrue(operationsTest.operations(test).contains("Шнорх"));


    }
}



