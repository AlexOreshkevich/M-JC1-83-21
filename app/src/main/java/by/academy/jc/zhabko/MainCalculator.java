package by.academy.jc.zhabko;

public class MainCalculator {
    public static void main(String[] args) {

        //Basic hometask int type
        DirtySum object1 = new DirtySum();
        System.out.println("DirtySum Int type result "+object1.sum(7,3));

        //Method overloading float type
        System.out.println("DirtySum Float type result "+object1.sum(3.2F,12.7F));

        //Method overloading double type
        System.out.println("DirtySum Double type result "+object1.sum(2.7, 2.3));

        //Method overloading short type
        short x1 = 10;
        short x2 = 17;
        System.out.println("DirtySum Short type result "+object1.sum(x1,x2));

        //Method overloading long type
        long x3 = 12;
        long x4 = 24;
        System.out.println("DirtySum Long type result "+object1.sum(x3,x4));

        //Method overloading byte type
        byte x5 = 22;
        byte x6 = 4;
        System.out.println("DirtySum byte type result "+object1.sum(x5,x6));

        //Division
        System.out.println("Division result is "+object1.division(26.2,2.14));
    }

}
