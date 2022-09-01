package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.LastDigitChecker.hasSameLastDigit;
import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @ParameterizedTest(name="{index} => a={0}, b={1}, c={2}, result={3}")
    @CsvSource({
            "41, 22, 71, true",
            "23, 32, 42, true",
            "9, 99, 999, false",
    })
    void shouldReturnCorrectValue(int a, int b, int c, boolean result){
        assertTrue(hasSameLastDigit(a, b, c)==result);
    }

}