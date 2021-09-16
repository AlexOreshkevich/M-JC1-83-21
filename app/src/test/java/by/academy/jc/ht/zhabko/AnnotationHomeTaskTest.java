package by.academy.jc.ht.zhabko;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationHomeTaskTest {

    @ParameterizedTest
    @MethodSource("providingRolesAndMoneySpend")
    void shouldcallTheAppropriateMethod(String role, int spend, int left) throws InstantiationException, IllegalAccessException, InvocationTargetException {
            Class annotatedClass = FamilyMember.class;
            Method[] methods = annotatedClass.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(FamilyBudget.class)) {
                    FamilyBudget family = method
                            .getAnnotation(FamilyBudget.class);
                    String userRole = family.userRole();
                    int budgetLimit = family.budgetLimit();
                    if (userRole.equals(role)) {
                        if(budgetLimit >= spend){
                            method.invoke(FamilyMember.class.newInstance(),
                                    budgetLimit, spend);
                            assertEquals(left,budgetLimit);
                        }
                    }
                }
            }

    }

    private static Stream <Arguments> providingRolesAndMoneySpend() {
        return Stream.of(
                Arguments.of("SENIOR",75,100),
                Arguments.of("JUNIOR",45,50),
                Arguments.of("SENIOR",40,100)
        );
    }
}



