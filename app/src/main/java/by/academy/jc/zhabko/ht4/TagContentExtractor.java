package by.academy.jc.zhabko.ht4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    private static String[] techArray;


    //Constructor of the "TagContentExtractor" object
    //Input argument here is the array of the String
    public TagContentExtractor(String[] inputArray) {
        techArray = Arrays.copyOf(inputArray,inputArray.length);
    }



    //Extraction method
    public String[] extractTextBetweenTags() {

        //Regex implementanion to search start tag(group1), end tag(no group), and content between tags(group2)
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        //Loop that searching content in every array case and extracting it
        for (int i=0; i<techArray.length; i++) {

            //Checking for an empty or "Null" array case
            if (techArray[i] == null || techArray[i].isBlank()) {
                throw new IllegalArgumentException("Missing required 'source' parameter");
            }

            Matcher matcher = pattern.matcher(techArray[i]);

            boolean found = false;
            while (matcher.find()) {
                found = true;
                techArray[i]=matcher.group(2);
            }
            if (!found) {
                techArray[i] = "None";
            }
            System.out.println(techArray[i]);
            }
        return techArray;
    }
    }





