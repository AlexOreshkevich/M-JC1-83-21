package by.academy.jc.ht.akbarova.ht11.pojo;

import java.util.List;

public class Trainer extends Person {

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public Trainer(String name, String surname) {
        super(name, surname);
    }

}
