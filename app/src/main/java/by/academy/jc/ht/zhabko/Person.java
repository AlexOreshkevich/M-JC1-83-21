package by.academy.jc.ht.zhabko;

import java.util.LinkedList;
import java.util.List;

public class Person {
    String name;
    String surName;
    int age;


    enum NAMES {
        Leily,
        Nataly,
        Alexey,
        Artur,
        Kate,
        Vladislav,
        Ilya,
        Valery,
        Dmitriy,
        Timofey,
        Ivan,
        Oleg;

        private static final Person.NAMES[] ENUMS = Person.NAMES.values();

        private static Person.NAMES of(int nameInt) {
            return ENUMS[nameInt];
        }
    }

   enum SURNAMES {
       Akbarova,
       Dubovtsova,
       Zhabko,
       Zabrodskiy,
       Zaikovskaya,
       Klimahovich,
       Lukashevich,
       Sergeichik,
       Skopinov,
       Shorohov,
       Ivanov,
       Borovskiy,
       Zaharov,
       Trus,
       Dvoryanskiy;

      private static final Person.SURNAMES[] ENUMS = Person.SURNAMES.values();

      private static Person.SURNAMES of (int surNameInt) {
          return ENUMS[surNameInt];
   }
    }

    public Person() {

        this.name = NAMES.of((int) (Math.random()*11)).toString();
        this.surName = SURNAMES.of((int)( Math.random()*14)).toString();
        this.age = (int) (Math.random()*(30-15)+15);

    }

    public static void main(String[] args) {
        List <Person> people = new LinkedList<>();
        for (int i=0; i<100; i++) {
            Person person = new Person();
            if (!people.contains(person)) {
                people.add(person);
            } else {
                continue;
            }

            System.out.println();
            System.out.print(person.name+"  ");
            System.out.print(person.surName+"  ");
            System.out.print(person.age+"  ");

            //people.stream().collect()
        }
    }
}
