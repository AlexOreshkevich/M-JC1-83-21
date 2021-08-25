package by.academy.jc.sergeichik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexFilter {
    public static String filter(String str) {

        Pattern p = Pattern.compile("0[xX][A-Fa-f0-9]+\\s");
        Matcher m = p.matcher(str);
        String strNew = str;
        while (m.find()) {

            strNew = str.replaceAll(p.pattern(), "");
        }
        return strNew;
    }
}
