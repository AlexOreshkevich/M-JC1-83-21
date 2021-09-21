package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class MayanCalendarTest {

    @Test
    void shouldCreateMayanLocalDateAndShowIt() {

        MayanLocalDate test = MayanLocalDate.of(1,1,1,1,1,1,1,1,1);

        assertEquals(1,test.getBaktun());
        assertEquals(1,test.getKatun());
        assertEquals(1,test.getTun());
        assertEquals(1,test.getWinal());
        assertEquals(1,test.getKin());
        assertEquals(1,test.getTzDayNumber());
        assertEquals(1,test.getTzDayNameInt());
        assertEquals(1,test.getHaabDayNumber());
        assertEquals(1,test.getHaabMonthNameInt());
    }

    @Test
    void shouldConvertGregorianDateToMayanDateAndShowIt() {

        LocalDate test = LocalDate.of(1970,1,1);
        MayanLocalDate test2 = MayanLocalDate.fromLocalDate(test);

        assertEquals(12,test2.getBaktun());
        assertEquals(14,test2.getKatun());
        assertEquals(6,test2.getTun());
        assertEquals(14,test2.getWinal());
        assertEquals(0,test2.getKin());
        assertEquals(1,test2.getTzDayNumber());
        assertEquals(11,test2.getTzDayNameInt());
        assertEquals(0,test2.getHaabDayNumber());
        assertEquals(15,test2.getHaabMonthNameInt());


    }

    @Test
    void shouldPlusPaysAndShowIt() {

        MayanLocalDate test = MayanLocalDate.of(1,1,1,1,1,1,1,1,1);

        test = test.plusDays(360);

        assertEquals(1,test.getBaktun());
        assertEquals(1,test.getKatun());
        assertEquals(2,test.getTun());
        assertEquals(0,test.getWinal());
        assertEquals(16,test.getKin());
        assertEquals(10,test.getTzDayNumber());
        assertEquals(1,test.getTzDayNameInt());
        assertEquals(16,test.getHaabDayNumber());
        assertEquals(1,test.getHaabMonthNameInt());
    }

    @Test
    void shouldSwitchTuns() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);

        assertEquals(1,test.plusDays(1).getTun());
        assertEquals(2,test.plusDays(2).getTun());
    }

    @Test
    void shouldSwitchKatuns() {
        MayanLocalDate test = MayanLocalDate.of(1, 1, 19, 18, 18, 1, 1, 1, 1);

        assertEquals(1,test.plusDays(1).getKatun());
        assertEquals(2,test.plusDays(2).getKatun());
    }

    @Test
     void shouldSwitchBaktuns() {
        MayanLocalDate test = MayanLocalDate.of(1,19,19,18,18,1,1,1,1);

        assertEquals(1,test.plusDays(1).getBaktun());
        assertEquals(2,test.plusDays(2).getBaktun());
    }

}
