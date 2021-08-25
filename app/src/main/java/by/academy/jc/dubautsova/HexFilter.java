package by.academy.jc.dubautsova;

public class HexFilter {
    public static String withoutHexNumbers(String line){
        line = line.replaceAll("0[xX][0-9A-F]+", "");
        return line;
    }
}
