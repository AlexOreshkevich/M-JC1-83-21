package by.academy.jc.ht.zhabko;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PersonAndPersonPipelineTest {

    @Test
    void shouldCreatePersonObjectWithAllFields() {
        Person testPerson = new Person();
        assertNotNull(testPerson);
        assertNotNull(testPerson.getName());
        assertNotNull(testPerson.getSurName());
        assertNotNull(testPerson.getAge());
    }

    @Test
    void shouldReturnTrueOnEqualPersonsAndFalseOnNotEquals() {
        Person testPersonFirst = new Person("Ivan","Ivanov",25);
        Person testPersonSecond = new Person("Ivan","Ivanov",25);
        Person testPersonThird = new Person("Boris","Borisov",32);
        Set <Person> testSet = new HashSet<>();

        assertTrue(testPersonFirst.equals(testPersonSecond));
        assertTrue(testPersonSecond.equals(testPersonFirst));
        assertFalse(testPersonFirst.equals(testPersonThird));
        assertFalse(testPersonSecond.equals(testPersonThird));
        assertFalse(testPersonFirst.equals(testSet));
    }

    @Test
    void shouldGenerateSetOfPersons() {
        PersonPipeline testPipeLine = new PersonPipeline();
        Set <Person> randomPersons = testPipeLine.generatePersonList(100);
        assertEquals(100,randomPersons.size());
    }

    @Test
    void shouldReturnFiveSurNamesInImmutableSet() {
        Person testPerson1 = new Person("Ivan","Ivanov",16);
        Person testPerson2 = new Person("Alexandr","Sergeev",17);
        Person testPerson3 = new Person("Sergey","Borisov",18);
        Person testPerson4 = new Person("Dmitriy","Knyazev",19);
        Person testPerson5 = new Person("Michail","Vtorov",20);
        Person testPerson6 = new Person("Anna","Semenova",21);
        Person testPerson7 = new Person("Elena","Portnaya",15);
        Person testPerson8 = new Person("Diana","Temnaya",14);
        Person testPerson9 = new Person("Darya","Strechina",24);
        Person testPerson10 = new Person("Kseniya","Votchinova",25);

        Set <Person> testSet = new HashSet<>();
        testSet.add(testPerson1);
        testSet.add(testPerson2);
        testSet.add(testPerson3);
        testSet.add(testPerson4);
        testSet.add(testPerson5);
        testSet.add(testPerson6);
        testSet.add(testPerson7);
        testSet.add(testPerson8);
        testSet.add(testPerson9);
        testSet.add(testPerson10);


        PersonPipeline testPipelIne = new PersonPipeline();
        ImmutableSet testImmutableSet = testPipelIne.getFiveSubNames(testSet);
        assertEquals(3,testImmutableSet.size());
        assertEquals("Ivanov",testImmutableSet.asList().get(0));
        assertEquals("Knyazev",testImmutableSet.asList().get(1));
        assertEquals("Portnaya",testImmutableSet.asList().get(2));
    }


}
