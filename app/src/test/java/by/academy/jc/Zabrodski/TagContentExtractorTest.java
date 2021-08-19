package by.academy.jc.Zabrodski;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TagContentExtractorTest {

//  int testCases = new Scanner(System.in).nextInt();
//
//  while(testCases >0) {
//    extractingText(new Scanner(System.in).nextLine());
//    testCases--;
//  }

  TagContentExtractor tagContentExtractor = new TagContentExtractor();

  @Test
  public void shouldExtractTextFromTags1() {
    assertEquals("Nayeem loves counseling",
        tagContentExtractor.extractTextFromTags("<h1>Nayeem loves counseling</h1>"));
  }

//  @Test
//  public void shouldExtractTextFromTags3() {
//    assertEquals("Sanjay has no watch", tagContentExtractor.extractTextFromTags(
//        "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>"));
//  }

  @Test
  public void shouldExtractTextFromTags4() {
    assertEquals("None",
        tagContentExtractor.extractTextFromTags("<Amee>safat codes like a ninja</amee>"));
  }

  @Test
  public void shouldExtractTextFromTag5() {
    assertEquals("Imtiaz has a secret crush", tagContentExtractor.extractTextFromTags(
        "<SA premium>Imtiaz has a secret crush</SA premium>"));
  }

  @Test
  public void shouldExtractTextFromTags6() {
    assertEquals("None", tagContentExtractor.extractTextFromTags("<h1>Hello, world!!!</h2>"));

  }

  @Test
  public void shouldExtractTextFromTags7() {
    assertEquals("Hello, world!",
        tagContentExtractor.extractTextFromTags("<h1>Hello, world!</h1>"));
  }
}