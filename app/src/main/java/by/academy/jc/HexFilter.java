package by.academy.jc;

public class HexFilter{
    public static String hexFilt(String a){
        a = a.replaceAll("0[xX][\\da-fA-F]+","");
        return a;
    }

}
