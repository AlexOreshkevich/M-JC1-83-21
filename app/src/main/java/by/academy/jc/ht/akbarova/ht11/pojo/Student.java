package by.academy.jc.ht.akbarova.ht11.pojo;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private final Map<String, Integer> marks = new HashMap<>();
    private Degree degree;
    private Course course;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Map<String, Integer> getMarks() {
        return new HashMap<>(marks);
    }

    public void setMarks(String className, int mark){
        marks.put(className, mark);
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public Course getCourse() {
        return course;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
