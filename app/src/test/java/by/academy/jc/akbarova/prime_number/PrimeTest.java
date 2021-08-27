package by.academy.jc.akbarova.prime_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void shouldReturnSecondPrimeNumber1() {
        Prime p = new Prime();

        assertEquals(59, p.isPrime(50, 70), "expected second prime number between 50 and 70 numbers");
    }

    @Test
    void shouldReturnSecondPrimeNumber2() {
        Prime p = new Prime();

        assertEquals(61, p.isPrime(54, 70), "expected second prime number between 54 and 70 numbers");
    }
}