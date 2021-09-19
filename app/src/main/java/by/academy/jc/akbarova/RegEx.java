package by.academy.jc.akbarova;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// enum Day{
//    MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false),SUNDAY(false);
//    private boolean isWorkingDay;
//    Day(boolean isWorkingDay){
//        this.isWorkingDay=isWorkingDay;
//    }
//    public boolean isWorkingDay(){
//        return isWorkingDay;
//    }
//}
public class RegEx {
    public static void main(String[] args) {

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("MMM d yyyy");
        LocalDate date=LocalDate.parse("2010 12",dt);
        System.out.println(date);

//        System.out.printf("%d%n", Month.MARCH.maxLength());
//        System.out.println(Arrays.toString(Day.values()));
//Pattern pt=Pattern.compile("www\\.(\\w+)\\.by");
//Matcher mt=pt.matcher("www.tut.by");
//mt.find();
//        System.out.println(mt.group());
//        String s="Test  string  for split";
//        System.out.println(Arrays.toString(s.split(" +")));

//        String inputText="xbcmdsjfkdfhasfhakdfkda 01.07.1988\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01.07.1990\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01-07-1999\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01.07.2003\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01/07/1992\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01.07.1997\n"+
//                "xbcmdsjfkdfhasfhakdfkda 01.07.2005\n";
//        Pattern pt=Pattern.compile("\\d{2}\\W{1}\\d{2}\\W{1}\\d{4}");
//        Matcher m= pt.matcher(inputText);
//        int count=0;
//        while(m.find()){
//            String s1=m.group();
//            String smas[]=s1.split("\\W{1}");
//
//            System.out.println(smas[2]);
//            System.out.println("------");

        }


    }

