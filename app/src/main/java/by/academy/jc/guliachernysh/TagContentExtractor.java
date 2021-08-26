package by.academy.jc.guliachernysh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile(

                "<([/a-zA-Z]+).*?>"

        );

        while(testCases>0) {

            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            List<String> tags = new ArrayList<>();
            while(matcher.find()) {
                String tag = matcher.group(0);
                tags.add(tag);
            }
            boolean none = true;
            while(tags.size() >= 2) {
                String tagB = tags.get(0);
                String tagE = tags.get(1);
                if (!tagB.replace("<", "</").equals(tagE)) {
                    tags.remove(0);
                    int x = line.indexOf(tagB);
                    line = line.substring(x + tagB.length());
                }
                else {
                    tags.remove(0);
                    tags.remove(0);
                    int x = line.indexOf(tagB) + tagB.length();
                    int y = line.indexOf(tagE, x);
                    String finding = line.substring(x,y);
                    line = line.substring(y + tagE.length());
                    if (!finding.isEmpty()) {
                        System.out.println(finding);
                        none = false;
                    }
                }
            }
            if (none) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
