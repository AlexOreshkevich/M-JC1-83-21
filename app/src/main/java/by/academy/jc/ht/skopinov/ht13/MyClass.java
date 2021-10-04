package by.academy.jc.ht.skopinov.ht13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {

  public List<Person> creatingPersons() {
    List<Person> group = new ArrayList<>();
    String[] name = {"Leyli", "Nataliya", "Alexey", "Artut", "Ekaterina", "Vladislav", "Iliya", "Valeriya", "Dmitry", "Timofey", "Ivan", "Petr", "Sergey", "Maxim", "Pavel"};
    String[] surname = {"Akbarova", "Dubovtsova", "Zhabko", "Zabrodskiy", "Zaykovskaya", "Klimahovich", "Lukashevich", "Sergeychik", "Skopinov", "Shorohov", "Ivanov", "Petrov", "Smirnov", "Sidorov", "Pavlov"};

    for (int i = 0; i < 100; i++) {
      group.add(new Person(name[(int) (Math.random() * 15)],
          surname[(int) (Math.random() * 15)],
          (int) (Math.random() * 16) + 15));
    }
    return group;
  }

  public Set<String> customCollector() {
    List<Person> group = creatingPersons();

    String mySurname = "Skopinov";
    Set<Character> letters = new HashSet<>();
    char[] chars = mySurname.toCharArray();
    for (char c : chars) {
      letters.add(c);
    }

    return group.stream()
        .filter(person -> person.getAge() < 21)
        .filter(person -> {
          char[] currentChars = person.getSurname().toCharArray();
          int numberOfMatches = 0;
          for (char letter : currentChars) {
            if (letters.contains(letter)) {
              numberOfMatches++;
            }
          }
          return numberOfMatches >= 2;
        })
        .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
        .limit(4)
        .map(Person::getSurname)
        .collect(new ImmutableSetCollector<>());
  }
}
