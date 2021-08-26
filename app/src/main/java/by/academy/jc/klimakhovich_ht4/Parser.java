package by.academy.jc.klimakhovich_ht4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static String none(){
        String none = "None";
        return none;
    }
    public static String stringTagFinder(String source) {


        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Missing required `source` parameter");
        }

        String tags = "<(.+)>([^\\<\\>]+)</\\1>";

        Pattern pattern = Pattern.compile(tags);
        Matcher matcher = pattern.matcher(source);


        boolean found = false;


        String result = source;
        while (matcher.find()) {

            result = matcher.group(2);

            found = true;
        }

        if (!found) {
            System.out.println(none());
        } else if (found) {
            System.out.println(result);
        }
        return result;
    }
}