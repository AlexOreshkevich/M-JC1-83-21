package by.academy.jc.reflection;

import by.academy.jc.App;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

public class ReflectionTest {

    @Test
    public void shouldDisplayAnnotations() {
        App app = new App();

        // TODO use getAnnotationsByType() instead
        Annotation[] annotations = app.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.getClass().getName());

            if (annotation instanceof Deprecated) {
                Deprecated deprecatedAnnotation = (Deprecated) annotation;
                System.out.println("Since = " + deprecatedAnnotation.since());
            }
        }

        if (annotations.length == 0) {
            System.out.println("No annotations present");
        }
    }
}
