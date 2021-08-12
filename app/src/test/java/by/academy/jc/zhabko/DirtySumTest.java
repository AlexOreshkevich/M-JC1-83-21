package by.academy.jc.zhabko;


    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;
public class DirtySumTest {
    @Test
    void sumadndivTest() {
        DirtySum DirtySumObTest = new DirtySum();
        //Int unit test
        assertEquals(DirtySumObTest.sum(7,12),103);
        //Float unit test
        assertEquals(DirtySumObTest.sum(2.5F, 3.2F),13.7F);
        //Double unit test
        assertEquals(DirtySumObTest.sum(2.5, 3.2), 13.7);
        //Short unit test
        short x1 = 11;
        short x2 = 23;
        assertEquals(DirtySumObTest.sum(x1,x2),287);
        //Long unit test
        long x3 = 13;
        long x4 = 22;
        assertEquals(DirtySumObTest.sum(x3,x4), 321);
        //byte unit test
        byte x5 = 5;
        byte x6 = 2;
        assertEquals(DirtySumObTest.sum(x5,x6),17);
        //Division test
        assertEquals(DirtySumObTest.division(9.3,3.2),2.90625);
    }

}
