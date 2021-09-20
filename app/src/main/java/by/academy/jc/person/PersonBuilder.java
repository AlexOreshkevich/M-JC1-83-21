package by.academy.jc.person;

import java.time.LocalDate;

public class PersonBuilder {
    private Person person;

    private PersonBuilder(){
        this.person = new Person();
    }


    public Person build(){
        if (person.getName() == null){
            throw new RuntimeException("Name What not set");
        }
        if (person.getBirthDate() == null){
            throw new RuntimeException("BirthDate what not set");
        }

        return person;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public PersonBuilder name (String name){
        this.person.setName(name);
        return this;
    }

    public PersonBuilder surname(String surname){
        this.person.setSurname(surname);
        return this;
    }

    public PersonBuilder birthDate(LocalDate birthDate){
        this.person.setBirthDate(birthDate);
        return this;
    }
}
