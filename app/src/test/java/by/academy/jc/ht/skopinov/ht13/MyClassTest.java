package by.academy.jc.ht.skopinov.ht13;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class MyClassTest {

  String[] names = {"Dmitry", "Maxim", "Alex", "Nikolay", "Sergey"};
  String[] surnames = {"Ivanov", "Petrov", "Smirnov", "Sidorov", "Pavlov"};
  int amountOfPersons = 5;
  MyClass myClass = new MyClass();

  @Test
  void creatingPersonsTest() {
    List<Person> list = myClass.creatingPersons(names, surnames, amountOfPersons);
    assertEquals(amountOfPersons, list.size());
    for (Person p : list) {
      assertTrue(p.getName().equals("Dmitry") || p.getName().equals("Maxim") || p.getName().equals("Alex") || p.getName().equals("Nikolay") || p.getName().equals("Sergey"));
      assertTrue(p.getSurname().equals("Ivanov") || p.getSurname().equals("Petrov") || p.getSurname().equals("Smirnov") || p.getSurname().equals("Sidorov") || p.getSurname().equals("Pavlov"));
      assertTrue(p.getAge() >= 15 && p.getAge() <= 30);
    }
  }

  @Test
  void mySurnameLettersTest() {
    Set<Character> mySurnameSet = myClass.mySurnameLetters("Skopinov");
    Set<Character> set = new HashSet<>(Set.of('s', 'k', 'o', 'p', 'i', 'n', 'v'));
    assertEquals(set, mySurnameSet);
  }

  @Test
  void customCollectorTest() {
    Person p1 = new Person("Dmitry", "Ivanov", 25);
    Person p2 = new Person("Maxim", "Petrov", 18);
    Person p3= new Person("Alex", "Smirnov", 20);
    Person p4 = new Person("Nikolay", "Sidorov", 30);
    Person p5 = new Person("Sergey", "Petrov", 5);
    Person p6 = new Person("Gosha", "Pavlov", 10);
    Person p7 = new Person("Evgeniy", "Petrov", 15);

    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);
    list.add(p6);
    list.add(p7);

    Set<String> result = myClass.customCollector(list, myClass.mySurnameLetters("Sachek"));
    assertTrue(result.isEmpty());

    Set<String> result1 = myClass.customCollector(list, myClass.mySurnameLetters("Skopinov"));
    Set<String> expectedResult1 = new HashSet<>();
    expectedResult1.add("Pavlov");
    expectedResult1.add("Petrov");

    assertEquals(expectedResult1, result1);
  }
}