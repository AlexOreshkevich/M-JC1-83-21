package by.academy.jc.zhabko;

public class BaseCalculator extends DirtySum {
    public static void main(String[] args) {
    BaseCalculator BaseCalcObj = new BaseCalculator();
    System.out.println(BaseCalcObj.sum(2,5));
    }

    @Override
    public int sum(int a, int b) {
        return super.sum(a, b);
    }
}
