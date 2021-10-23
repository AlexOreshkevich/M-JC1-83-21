package by.academy.jc.io;

import by.academy.jc.aggregate.Person;
import java.util.List;
import java.util.function.IntConsumer;

class Averager implements IntConsumer {

  private int total = 0;
  private int count = 0;

  public double average() {
    return count > 0 ? ((double) total) / count : 0;
  }

  public void accept(int i) {
    total += i;
    count++;
  }

  public void combine(Averager other) {
    total += other.total;
    count += other.count;
  }
}

public class Example {

  public static void main(String[] args) {

    List<Person> roster = Person.createRoster();

    Averager averageCollect = roster.stream()
        .filter(p -> p.getGender() == Person.Sex.MALE)
        .map(Person::getAge)
        .collect(Averager::new, Averager::accept, Averager::combine);

    System.out.println("Average age of male members: " +
        averageCollect.average());

  }
}
