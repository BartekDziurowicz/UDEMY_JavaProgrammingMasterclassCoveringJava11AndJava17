package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.FirstAndLastDigitSum.sumFirstAndLastDigit;
import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitSumTest {

    @ParameterizedTest(name="{inmdex} => number={0}, sum={1}")
    @CsvSource({
            "252, 4",
            "257, 9",
            "0, 0",
            "5, 5",
            "-10, -1"
    })
    void shouldReturnCorrectValue(int number, int result){
        assertTrue(sumFirstAndLastDigit(number)==result);
    }
}