package by.academy.jc.ht.akbarova.ht11.pojo;

import by.academy.jc.ht.akbarova.ht11.factory.ComputerScience;
import by.academy.jc.ht.akbarova.ht11.factory.CourseAbstract;
import by.academy.jc.ht.akbarova.ht11.factory.Java;
import by.academy.jc.ht.akbarova.ht11.factory.Python;
import by.academy.jc.ht.akbarova.ht11.schedule.LearningSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Academy {

    private static Academy academy = null;

    public static Academy getInstance() {
        if (academy == null) {
            academy = new Academy();
        }
        return academy;
    }

    private final LearningSchedule learningSchedule = new LearningSchedule();

    private final List<Trainer> trainers = Arrays.asList(
            new Trainer("Oleq", "Oleqovich"),
            new Trainer("Egor", "Egorovich")
    );

    private final List<Course> courses = Arrays.asList(
            new Course(
                    new Group(),
                    new Java(),
                    trainers.get(0),
                    Arrays.asList(new Class("OOP"), new Class("Design patterns"), new Class("Algorithms"))
            ),
            new Course(
                    new Group(),
                    new ComputerScience(),
                    trainers.get(1),
                    Arrays.asList(new Class("Basics"), new Class("Data analytics"))
            ),
            new Course(
                    new Group(),
                    new Python(),
                    trainers.get(0),
                    Arrays.asList(new Class("Math functions"), new Class("Advanced algorithms"))
            )
    );

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public void makeAgreement(Student student, CourseAbstract course) {
        Course selectedCourse = courses
                .stream()
                .filter(c -> c.getCourse().getName().equals(course.getName()))
                .findFirst().get();
        student.setCourse(selectedCourse);
        selectedCourse.getGroup().addStudent(student);
        learningSchedule.launchCourse(selectedCourse);
    }

}
