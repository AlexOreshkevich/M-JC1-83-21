package by.academy.jc.zhabko;


    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;
public class DirtySumTest {
    @Test
    void DirtySumTestingUnit() {
        DirtySum DirtySumObTest = new DirtySum();
        //Int unit test
        assertEquals(DirtySumObTest.DirtySumMethod(7,12),103);
        //Float unit test
        assertEquals(DirtySumObTest.DirtySumMethod(2.5F, 3.2F),13.7F);
        //Double unit test
        assertEquals(DirtySumObTest.DirtySumMethod(2.5, 3.2), 13.7);
        //Short unit test
        assertEquals(DirtySumObTest.DirtySumMethod(11, 23), 287);
        //Long unit test
        assertEquals(DirtySumObTest.DirtySumMethod(13,22), 321);
        //byte unit test
        assertEquals(DirtySumObTest.DirtySumMethod(5,2),17);
        //Division test
        assertEquals(DirtySumObTest.DivisionMethod(9.3,3.2),2.90625);
    }

}
