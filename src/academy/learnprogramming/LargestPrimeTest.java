package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.LargestPrime.getLargestPrime;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    @ParameterizedTest(name="{index} => number: {0}, largestPrime: {1}")
    @CsvSource({
            "21, 7",
            "217, 31",
            "0, -1",
            "45, 5",
            "-1, -1"
    })
    void shouldReturnCorrectValue(int number, int result) {
        assertEquals(getLargestPrime(number), result);
    }

}