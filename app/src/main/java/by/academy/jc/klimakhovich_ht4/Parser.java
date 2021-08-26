package by.academy.jc.klimakhovich_ht4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static void stringTagFinder(String source) {


        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Missing required `source` parameter");
        }

        String tags = "<(.+)>([^\\<\\>]+)</\\1>";

        Pattern pattern = Pattern.compile(tags);
        Matcher matcher = pattern.matcher(source);


        boolean found = false;


        while (matcher.find()) {

            source = matcher.group(2);

            found = true;
        }

        if (!found) {
            System.out.println("None");
        } else if (found) {
            System.out.println(source);
        }
    }
}