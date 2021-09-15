package by.academy.jc.zhabko;

import java.time.LocalDateTime;



public class DateFormatter {

    private static String output;





    public static String dateFormat (LocalDateTime localDateTime) {
        StringBuffer outputFormat;
        outputFormat.append("Year is "+localDateTime.getYear());
        outputFormat.append(" Month is "+localDateTime.getMonthValue());
        outputFormat.append(" Day is "+localDateTime.getDayOfYear());
        output=outputFormat.toString();

        return outputFormat;
    }
}
