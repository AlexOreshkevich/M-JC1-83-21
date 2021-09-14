package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MayanCalendarTest {

    @Test
    void shouldCreateMayanLocalDateAndShowIt() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,1,1,1,1,1,1);
        test.show();
    }

    @Test
    void shouldConvertGregorianDateToMayanDateAndShowIt() {
        LocalDate test = LocalDate.of(1970,1,1);
        MayanLocalDate test2 = MayanLocalDate.fromLocalDate(test);
        test2.show();
    }

    @Test
    void shouldPlusPaysAndShowIt() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,1,1,1,1,1,1);
        for (int i=1; i<364; i++){
            test.plusDays(i).show();
        }
    }

    @Test
    void shouldSwitchTuns() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,15,1,1,1,1);
        for (int i=1; i<10; i++){
            test.plusDays(i).show();
        }
    }

    @Test
    void shouldSwitchKatuns() {
        MayanLocalDate test = MayanLocalDate.of(1, 1, 19, 18, 15, 1, 1, 1, 1);
        for (int i = 1; i < 10; i++) {
            test.plusDays(i).show();
        }
    }

    @Test
     void shouldSwitchBaktuns() {
        MayanLocalDate test = MayanLocalDate.of(1,19,19,18,15,1,1,1,1);
         for (int i=1; i<10; i++){
             test.plusDays(i).show();
         }
    }

}
