package by.academy.jc.ht.akbarova.ht11.pojo;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
