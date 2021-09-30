package by.academy.jc.ht.zhabko;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Person {

    private String name;
    private String surName;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }


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

    public Person(String name, String surName, int age) {

        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o.getClass() != Person.class) {
            return false;
        } else {
            if (((Person) o).getName() == name && ((Person) o).getSurName() == surName && ((Person) o).getAge() == age) {
                return true;
            } else {
                return false;
            }
        }


    }
}

