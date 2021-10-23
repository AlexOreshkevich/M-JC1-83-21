package by.academy.jc.ht.akbarova.ht11.schedule;

import by.academy.jc.ht.akbarova.ht11.pojo.Course;

public class LearningSchedule {

    public void launchCourse(Course course){
        if(course.getGroup().getStudents().size() >= 10) {
            course.setActive(true);
        }
    }

}
