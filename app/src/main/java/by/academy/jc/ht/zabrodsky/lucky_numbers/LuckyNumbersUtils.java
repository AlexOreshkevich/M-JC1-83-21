package by.academy.jc.ht.zabrodsky.lucky_numbers;

public class LuckyNumbersUtils {

  public static boolean isLucky(int n) {
    boolean result = false;
    if ((numberOfDigits(n) % 2 == 0) && (n > 10) && (n < 10E6)) {
      int exp = numberOfDigits(n) / 2;
      int value = (int) Math.pow(10, exp);

      int firstHalfOfTheNumber = n / value;
      int secondHalfOfTheNumber = n % value;

      int sum1 = 0;
      int sum2 = 0;

      for (int count = exp; count > 0; count--) {
        sum1 += firstHalfOfTheNumber % 10;
        firstHalfOfTheNumber /= 10;
        sum2 += secondHalfOfTheNumber % 10;
        secondHalfOfTheNumber /= 10;
      }

      if (sum1 == sum2) {
        result = true;
      }
    }
    return result;
  }

  public static int numberOfDigits(int number) {
    return number == 0 ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
  }
}