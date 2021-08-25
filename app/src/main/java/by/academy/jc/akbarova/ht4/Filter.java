package by.academy.jc.akbarova.ht4;

public class Filter {
    public static String filterContent(String a) {
        String newline = a.replaceAll("[0xA-F]{4}", "");
        newline = newline.replaceAll("[\\s]{2,}", " ");
        return newline;
    }
}
