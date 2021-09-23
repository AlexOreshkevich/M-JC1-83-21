package by.academy.jc.aggregate;

import java.util.List;

public class BulkDataOperationsExamples {

  public static void main(String... args) {

    // Create sample data

    List<Person> roster = Person.createRoster();

    // 1. Print names of members, for-each loop

    System.out.println("Members of the collection (for-each loop):");
    for (Person p : roster) {
      System.out.println(p.getName());
    }

    // 2. Print names of members, forEach operation

    System.out.println("Members of the collection (bulk data operations):");
    roster
        .stream()
        .forEach(e -> System.out.println(e.getName()));

    // 3. Print names of male members, forEach operation

    System.out.println(
        "Male members of the collection (bulk data operations):");
    roster
        .stream()
        .filter(e -> e.getGender() == Person.Sex.MALE)
        .forEach(e -> System.out.println(e.getName()));

    // 4. Print names of male members, for-each loop

    System.out.println("Male members of the collection (for-each loop):");
    for (Person p : roster) {
      if (p.getGender() == Person.Sex.MALE) {
        System.out.println(p.getName());
      }
    }

    // 5. Get average age of male members of the collection:

    double average = roster
        .stream()
        .filter(p -> p.getGender() == Person.Sex.MALE)
        .mapToInt(Person::getAge)
        .average()
        .getAsDouble();

    System.out.println(
        "Average age of male members (bulk data operations): " +
            average);
  }
}
