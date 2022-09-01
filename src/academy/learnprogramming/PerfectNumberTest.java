package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.PerfectNumber.isPerfectNumber;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @ParameterizedTest(name="{index} => number {0}, isPerfect {1}")
    @CsvSource({
            "6, true",
            "28, true",
            "5, false",
            "-1, false"
    })
    void shouldReturnCorrectValueFromSwitch(int number, boolean result) {
        assertEquals(isPerfectNumber(number), result);
    }

}