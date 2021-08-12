package by.academy.jc.zhabko;

public class BaseCalculator extends DirtySum {
    public static void main(String[] args) {
    BaseCalculator BaseCalcObj = new BaseCalculator();
    System.out.println(BaseCalcObj.DirtySumMethod(2,5));
    }

    @Override
    public int DirtySumMethod(int a, int b) {
        return super.DirtySumMethod(a, b);
    }
}
