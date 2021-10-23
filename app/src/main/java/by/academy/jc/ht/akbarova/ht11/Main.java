package by.academy.jc.ht.akbarova.ht11;

import by.academy.jc.ht.akbarova.ht11.factory.ComputerScience;
import by.academy.jc.ht.akbarova.ht11.factory.CourseAbstract;
import by.academy.jc.ht.akbarova.ht11.factory.Java;
import by.academy.jc.ht.akbarova.ht11.factory.Python;
import by.academy.jc.ht.akbarova.ht11.pojo.Academy;
import by.academy.jc.ht.akbarova.ht11.pojo.Degree;
import by.academy.jc.ht.akbarova.ht11.pojo.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Academy academy = Academy.getInstance();
        for (int i = 0; i < 30; i++) {
            Student person = new Student("Student " + i, i + " Student");
            CourseAbstract myCourse = selectRandomCourse();
            academy.makeAgreement(person, myCourse);
        }
        academy.getCourses().forEach(course -> {
            if (course.isActive()) {
                course.getGroup().getStudents().forEach(student -> {
                    student.getCourse().getClasses().forEach(c -> student.setMarks(c.getName(), pickRandomInRange(11)));
                    List<Integer> marks = new ArrayList<>();
                    student.getMarks().forEach((className, mark) -> marks.add(mark));
                    student.setDegree(getDegreeByAvgMark(
                            marks.stream()
                                    .mapToDouble(d -> d)
                                    .average()
                                    .orElse(0.0)
                    ));
                });
            }
        });
        getInfo(academy);
    }

    private static void getInfo(Academy academy) {
        academy.getCourses().forEach(course -> {
            System.out.println("- Course: " + course.getCourse().getName());
            System.out.println("- Trainer " + course.getTrainer().getName() + " " + course.getTrainer().getSurname());
            System.out.println("- The number of attendances: " + course.getGroup().getStudents().size());
            System.out.println("- Finished: " + (course.isActive() ? "Yes" : "No"));
            if (course.isActive()) {
                System.out.println("- Student average marks:");
                course.getGroup().getStudents().forEach(student -> {
                    System.out.println("--- Student: " + student.getName() + " " + student.getSurname());
                    System.out.println("--- Degree: " + student.getDegree());
                    student.getMarks().forEach((className, mark) -> {
                        System.out.println("Class: " + className);
                        System.out.println("Mark: " + mark);
                        System.out.println();
                    });
                });
            }
            System.out.println("--------------------------------");
        });
    }

    private static CourseAbstract selectRandomCourse() {
        return Arrays.asList(
                new Java(),
                new Python(),
                new ComputerScience()
        ).get(pickRandomInRange(3));
    }

    private static int pickRandomInRange(int max) {
        return new Random().nextInt(max);
    }

    private static Degree getDegreeByAvgMark(double avgMark) {
        if (avgMark >= 9) return Degree.A;
        else if (avgMark >= 8) return Degree.B;
        else if (avgMark >= 7) return Degree.C;
        else if (avgMark >= 6) return Degree.D;
        else if (avgMark >= 5) return Degree.E;
        else return Degree.F;
    }

}
