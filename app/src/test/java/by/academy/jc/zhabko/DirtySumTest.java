package by.academy.jc.zhabko;


    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;
public class DirtySumTest {
    @Test
    void sumTest() {
        DirtySum DirtySumObTest = new DirtySum();
        //Int unit test
        assertEquals(DirtySumObTest.sum(7,12),103);
        //Float unit test
        assertEquals(DirtySumObTest.sum(2.5F, 3.2F),13.7F);
        //Double unit test
        assertEquals(DirtySumObTest.sum(2.5, 3.2), 13.7);
        //Short unit test
        assertEquals(DirtySumObTest.sum(11, 23), 287);
        //Long unit test
        assertEquals(DirtySumObTest.sum(13,22), 321);
        //byte unit test
        assertEquals(DirtySumObTest.sum(5,2),17);
        //Division test
        assertEquals(DirtySumObTest.division(9.3,3.2),2.90625);
    }

}
