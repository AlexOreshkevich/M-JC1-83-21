package by.academy.jc.ht.zhabko;







import com.google.common.collect.ImmutableSet;
import java.util.*;


import static by.academy.jc.ht.zhabko.ImmutableSetCollector.toImmutableSet;

public class PersonPipeline {



    public Set <Person> generatePersonList(int howManyPersons) {
        Set <Person> randomPersons = new HashSet<Person>();
        for (int i = 0; i < howManyPersons; i++) {
            Person person = new Person();
            randomPersons.add(person);
        }
        return randomPersons;
    }

    public <String> ImmutableSet  getFiveSubNames (Set <by.academy.jc.ht.zhabko.Person> list) {

        ImmutableSet<java.lang.String> subNames = list.stream()
                .filter(person -> person.getAge() < 21)
                .filter(person -> {

                            char[] myChars = "zhabko".toCharArray();
                            Set <Character> myCharsSet = new HashSet<>();
                            for (char letter : myChars) {
                                myCharsSet.add(letter);
                            }

                            char[] targetChars = person.getSurName().toCharArray();
                            Set <Character> targetCharsSet = new HashSet<>();
                            for (char letter : targetChars) {
                                targetCharsSet.add(letter);
                            }

                            int counter = 0;

                            for (Character letter : targetCharsSet) {
                                if (myCharsSet.contains(letter)) {
                                    counter++;
                                }
                            }
                            return counter >= 2;
                        }
                )
                .peek(person -> {
                    System.out.print(person.getSurName() + " ");
                    System.out.print(person.getName() + " ");
                    System.out.print(person.getAge());
                    System.out.println();
                })
                .sorted(new Comparator<Person>(){
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getSurName().charAt(0) - o2.getSurName().charAt(0);
                    }
                }.thenComparing(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getName().charAt(0) - o2.getName().charAt(0);
                    }
                }))
                .limit(5)
                .map(person -> person.getSurName())
                .collect(toImmutableSet());

        return subNames;
    }

}
