package by.academy.jc.zaikouskaya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexFilter {

    public static String filter(String source){

        //verify input arguments
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Missing required `source` parameter");
        }

        //matches what are looking for
        String str = "[0[xX][0-9a-fA-F]]+";
        Pattern p  = Pattern.compile(str);

        //where matches are sought
        Matcher m = p.matcher(source);

        //string outputting the result of hexadecimal removing
        String result = source;

        //hexadecimal removing
        while (m.find()){
            result = result.replaceAll(m.group(), "");
        }
        return result;

    }

}