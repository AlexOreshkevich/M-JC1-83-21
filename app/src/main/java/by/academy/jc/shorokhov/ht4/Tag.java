package by.academy.jc.shorokhov.ht4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag {
    public static String TagOff(String line) {

        String test = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
        Pattern p = Pattern.compile(test);
        Matcher m = p.matcher(line);
        boolean found = false;
        while (m.find()) {
            line = m.group(2);
            found = true;
        }
        if (!found) {
            line = "None";

        }
        System.out.println(line);

        return line;
    }
}

