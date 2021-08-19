package by.academy.jc.dubautsova;

public class FilterString {

    public static String filterContent(String line){
        String lineOutput = line.replaceAll("<.*?>", "");
        return lineOutput;
    }
}
