package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


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

    @Test
    void shouldReturnEnumTzilkinDaysNames() {
        String[] arrFromTz = new String [20];
        String[] testArray = { "Imix","Ik","Akbal","Kan","Chicchan","Cimi","Manik","Lamat","Muluc","Oc","Cheun","Eb","Ben","Ix","Men","Cib", "Caban","Etznab","Cauac","Ahau"};
        for (int i=1; i<=20; i++) {
            arrFromTz[i-1] = MayanLocalDate.TZDAYNAMES.of(i).toString();
        }
        assertArrayEquals(testArray,arrFromTz);
    }

    @Test
    void shouldReturnEnumHaabMinthNames() {
        String[] arrFromTz = new String [19];
        String[] testArray = {"Pop","Uo","Zip","Zotz","Tzec","Xul","Yaxkin","Mol","Chen","Yax","Zac","Keh","Mac","Kankin","Muwan","Pax","Kayab","Kumku","Wayeb"};
        for (int i=1; i<=19; i++) {
            arrFromTz[i-1] = MayanLocalDate.HAABMONTHNAMES.of(i).toString();
        }
        assertArrayEquals(testArray,arrFromTz);
    }

    @Test
    void shouldReturnChronology() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);
        assertNotNull(test.getChronology());
    }

    @Test
    void shouldReturnLengthOfMonth() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);
        assertEquals(20,test.lengthOfMonth());
    }

    @Test
    void shouldReturnUntil() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);
        assertEquals(0,test.until(test, ChronoUnit.DAYS));
    }

    @Test
    void shouldReturnUntil2() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);
        assertNull(test.until(test));
    }

    @Test
    void shouldReturnLong() {
        MayanLocalDate test = MayanLocalDate.of(1,1,1,18,18,1,1,1,1);
        assertEquals(0,test.getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
    }
}
