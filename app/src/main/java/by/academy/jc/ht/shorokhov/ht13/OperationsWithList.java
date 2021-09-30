package by.academy.jc.ht.shorokhov.ht13;

import com.google.common.collect.ImmutableSet;

import java.util.Comparator;
import java.util.List;

import static by.academy.jc.ht.shorokhov.ht13.ImmutableSetCollector.toImmutableSet;


public class OperationsWithList {

    public ImmutableSet<String> operations(List<Person> list) {


    ImmutableSet<String> result =  list.stream().filter(p -> p.getAge() < 21 & p.isCurrentSurname())
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Comparator.comparing(Person::getName)))
                .limit(4).map(Person::getSurname).collect(toImmutableSet());


        return result;
    }


    public static void main(String[] args) {
        OperationsWithList non = new OperationsWithList();
        List<Person> list = Person.createList();
        System.out.println(non.operations(list));

        }
        }










