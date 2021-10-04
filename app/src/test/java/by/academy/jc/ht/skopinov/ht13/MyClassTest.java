package by.academy.jc.ht.skopinov.ht13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class MyClassTest {

  @Test
  void isAmountOfCreatingPersonsCorrect() {
    MyClass myClass = new MyClass();
    List<Person> list = myClass.creatingPersons();
    assertEquals(100, list.size());
  }

  @Test
  void isResultSizeCorrect() {
    MyClass myClass = new MyClass();
    Set<String> set = myClass.customCollector();
    assertTrue(set.size() <= 4);
  }

  @Test
  void isSurnamesInResultContainTheLettersYouWant() {
    MyClass myClass = new MyClass();
    Set<String> set = myClass.customCollector();

    String mySurname = "Skopinov";
    Set<Character> letters = new HashSet<>();
    char[] chars = mySurname.toCharArray();
    for (char c : chars) {
      letters.add(c);
    }

    List<Integer> allLettersMatches = new ArrayList<>();

    for (String s : set) {
      char[] currentChars = s.toCharArray();
      int numberOfMatches = 0;
      for (char letter : currentChars) {
        if (letters.contains(letter)) {
          numberOfMatches++;
        }
      }
      allLettersMatches.add(numberOfMatches);
    }
    for (Integer i : allLettersMatches) {
      assertTrue(i >= 2);
    }
  }
}