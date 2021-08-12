package by.academy.jc.zhabko;


    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;
public class DirtySumTest {
    @Test
    void sumadndivTest() {
        DirtySum DirtySumObTest = new DirtySum();
        //Int unit test
        assertEquals(103,DirtySumObTest.sum(7,12), "must return 103");
        //Float unit test
        assertEquals(13.7F,DirtySumObTest.sum(2.5F, 3.2F), "must return 13.7F");
        //Double unit test
        assertEquals(13.7, DirtySumObTest.sum(2.5, 3.2), "must return 13.7");
        //Short unit test
        short x1 = 11;
        short x2 = 23;
        assertEquals(287,DirtySumObTest.sum(x1,x2), "must return 287");
        //Long unit test
        long x3 = 13;
        long x4 = 22;
        assertEquals(321,DirtySumObTest.sum(x3,x4), "must return 321");
        //byte unit test
        byte x5 = 5;
        byte x6 = 2;
        assertEquals(17,DirtySumObTest.sum(x5,x6), "must return 17");
        //Division test
        assertEquals(2.90625,DirtySumObTest.division(9.3,3.2), "must return 2.90625");
    }

}
