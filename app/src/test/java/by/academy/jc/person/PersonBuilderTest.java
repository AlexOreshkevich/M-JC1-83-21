package by.academy.jc.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test
    void shouldCreatePerson(){
        Person person = PersonBuilder.builder()
                .name("Arthur")
                .surname("Zabrodski")
                .birthDate(LocalDate.of(1987, 01, 01))
                .build();

        assertNotNull(person);
    }

}