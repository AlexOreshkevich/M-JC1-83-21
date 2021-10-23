package by.academy.jc.ht.akbarova.ht11.pojo;

import by.academy.jc.ht.akbarova.ht11.factory.CourseAbstract;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private final Group group;
    private final CourseAbstract course;
    private final Trainer trainer;
    private List<Class> classes = new ArrayList<>();
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Group getGroup() {
        return group;
    }

    public CourseAbstract getCourse() {
        return course;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public Course(Group group, CourseAbstract course, Trainer trainer, List<Class> classes) {
        this.group = group;
        this.course = course;
        this.trainer = trainer;
        this.classes = new ArrayList<>(classes);
    }
}
