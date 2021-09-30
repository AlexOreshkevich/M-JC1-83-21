package by.academy.jc.ht.shorokhov.ht13;

import com.google.common.collect.Sets;

import java.util.*;

public class Person {
    String name;
    String surname;
    String mySurname = "шорохов";
    int age;


    public Person(String name, String surname, int age) {
        this.age = age;
        this.surname = surname;
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }


    public String printInfo(){
        return (getName() + " " + getSurname() + ", " + getAge() + " y.o.");
    }


    public boolean isCurrentSurname(){

            Set<Character> letters = new HashSet<>();
        char[] chars = mySurname.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : chars) {
            letters.add(c);
        }

            Set<Character> letters1 = new HashSet<>();
        char[] chars1 = surname.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : chars1) {
            letters1.add(c);
        }
            Set<Character> letters3 = Sets.intersection(letters,letters1);


        return letters3.size()>=2;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,surname,age);
    }



    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }


    public static int rnd(){
        int min;
        int max;
        return (int) (15+Math.random()*16);
    }

    public static String rndSurname(){
        List<String> surnames = Arrays.asList("Акбарова","Дубовцова",
                "Жабко", "Забродский",
                "Зайковская","Климахович","Лукашевич",
                "Сергейчик","Скопинов","Шорохов","Петров",
                "Сидоров","Иванов","Васин","Сухоцкий","Вениаминов",
                "Кузнецов","Орешкевич","Абдулаев","Сиськин","Путин",
                "Крыжко","Ложко","Бабарикин","Нгуен","Кочергин","Касперович",
                "Попрыгун","Дорожко","Горбатенко","Филатов");
        Random random = new Random();

        return surnames.get(random.nextInt(surnames.size()));
    }

    public static String rndName(){
        List<String> names = Arrays.asList("Тимофей","Виталий","Василий",
                "Егор","Михаил","Евгений","Александра","Валерия","Мария","Василиса");

        Random random = new Random();

        return names.get(random.nextInt(names.size()));
    }


    public static List<Person> createList() {
        List<Person> list = new ArrayList<>();
        for(int i = 0; i<100; i++) {
            list.add(new Person(rndName(), rndSurname(), rnd()));

        }


        return list;
    }

}