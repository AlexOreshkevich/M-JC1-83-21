package by.academy.jc.ht.skopinov.ht13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {

  String[] names = {"Leyli", "Nataliya", "Alexey", "Artut", "Ekaterina", "Vladislav", "Iliya", "Valeriya", "Dmitry", "Timofey", "Ivan", "Petr", "Sergey", "Maxim", "Pavel"};
  String[] surnames = {"Akbarova", "Dubovtsova", "Zhabko", "Zabrodskiy", "Zaykovskaya", "Klimahovich", "Lukashevich", "Sergeychik", "Skopinov", "Shorohov", "Ivanov", "Petrov", "Smirnov", "Sidorov", "Pavlov"};
  int amountOfPersons = 100;

  public List<Person> creatingPersons(String[] names, String[] surnames, int amountOfPersons) {
    this.names = names;
    this.surnames = surnames;
    this.amountOfPersons = amountOfPersons;
    List<Person> group = new ArrayList<>();
    for (int i = 0; i < amountOfPersons; i++) {
      group.add(new Person(names[(int) (Math.random() * names.length)],
          surnames[(int) (Math.random() * surnames.length)],
          (int) (Math.random() * 16) + 15));
    }
    return group;
  }

  public Set<Character> mySurnameLetters(String surname){
    Set<Character> letters = new HashSet<>();
    char[] chars = surname.toLowerCase().toCharArray();
    for (char c : chars) {
      letters.add(c);
    }
    return letters;
  }

  public Set<String> customCollector(List<Person> group, Set<Character> mySurnameLetters) {
    return group.stream()
        .filter(person -> person.getAge() < 21)
        .filter(person -> {
          char[] currentChars = person.getSurname().toLowerCase().toCharArray();
          int numberOfMatches = 0;
          for (char letter : currentChars) {
            if (mySurnameLetters.contains(letter)) {
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
