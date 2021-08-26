package by.academy.jc.sergeichik;


public class WordCounter {
    public static int words(String inputStr) {
        String str = inputStr.trim();
        String line[] = str.split("\\s+");

        return line.length;
    }
}
