package by.academy.jc.zhabko.ht4;

import org.apache.commons.io.IOUtils;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


import java.io.FileInputStream;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;



public class TagContentExtractorTest {


    //Parameterized Unit test. Uses imported files with input and output information
    @ParameterizedTest
    @MethodSource("importAndOutputArguments")
    void shouldReturnStringsWithoutTagsParameterizedTest(String input, String output) {
    TagContentExtractor testObject = new TagContentExtractor(input);
    assertEquals(output,testObject.extractTextBetweenTags());
    }

    //Method to provide inputs and outputs to parameterized Unit test
    private static Stream<Arguments> importAndOutputArguments () throws IOException {
    FileInputStream f_import1 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\input\\input00.txt");
    String stringInput1 = IOUtils.toString(f_import1, StandardCharsets.UTF_8);
    FileInputStream f_output1 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\output\\output00.txt");
    String stringOutput1 = IOUtils.toString(f_output1, StandardCharsets.UTF_8);

    FileInputStream f_import2 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\input\\input01.txt");
    String stringInput2 = IOUtils.toString(f_import2, StandardCharsets.UTF_8);
    FileInputStream f_output2 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\output\\output01.txt");
    String stringOutput2 = IOUtils.toString(f_output2, StandardCharsets.UTF_8);

    FileInputStream f_import3 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\input\\input02.txt");
    String stringInput3 = IOUtils.toString(f_import3, StandardCharsets.UTF_8);
    FileInputStream f_output3 = new FileInputStream("C:\\Users\\User\\IdeaProjects\\M-JC1-83-21\\app\\src\\test\\tag-content-extractor-testcases\\output\\output02.txt");
    String stringOutput3 = IOUtils.toString(f_output3, StandardCharsets.UTF_8);
    return Stream.of(
            Arguments.of(stringInput1,stringOutput1),
            Arguments.of(stringInput2,stringOutput2),
            Arguments.of(stringInput3,stringOutput3)
    );
    }
}









