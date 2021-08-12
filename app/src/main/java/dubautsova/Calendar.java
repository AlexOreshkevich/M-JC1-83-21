package dubautsova;

import java.time.Instant;
import java.time.Period;

public class Calendar {
    public static void main(String[] args) {
        // Change the date in these brackets
        Instant inst = Instant.parse("2021-08-12T12:00:00.00Z");
        Instant newData = inst.plus(Period.ofDays(1));
        System.out.println("Дата следующего дня: " + newData);
    }
}
