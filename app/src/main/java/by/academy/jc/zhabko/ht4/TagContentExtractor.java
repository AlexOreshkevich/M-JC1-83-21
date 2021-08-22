package by.academy.jc.zhabko.ht4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    private final String techString ;
    private String techStringOutput="";


    //Constructor of the "TagContentExtractor" object
    public TagContentExtractor(String inputString) {
        techString = inputString;
    }


    //Extraction method
    public String extractTextBetweenTags() {

        //Regex implementation to search start tag(group1), end tag(no group), and content between tags(group2)
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);


        Scanner scan = new Scanner(techString);
        int testCases = Integer.parseInt(scan.nextLine());


        while (testCases > 0){
            String line = scan.nextLine();
            Matcher matcher = pattern.matcher(line);


            boolean found = false;
            while (matcher.find()) {
            found = true;
            techStringOutput += matcher.group(2)+"\n";
            }
            if (!found) {
            techStringOutput += "None"+"\n";
            }
            testCases--;
    }
    System.out.println(techStringOutput);
    return techStringOutput;
    }
}






