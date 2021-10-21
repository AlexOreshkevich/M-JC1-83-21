package by.academy.jc.ht.skopinov.ht14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AverageNumberTest {

  @Test
  void getAverageNumber() throws InterruptedException {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10000000; i++){
      numbers.add((int) (Math.random() * 10000000));
    }

    double average = numbers.stream()
        .mapToInt(Integer::intValue)
        .average()
        .getAsDouble();

    assertEquals(average, new AverageNumber().getAverageNumber(numbers));
  }
}