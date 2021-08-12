package by.academy.jc.zhabko;


    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;
public class DirtySumTest {
    @Test
    void DirtySumYestingUnit1() {
        DirtySum DirtySumObTest = new DirtySum();
        assertEquals(DirtySumObTest.DirtySumMethod(7,12),103);
    }

}
