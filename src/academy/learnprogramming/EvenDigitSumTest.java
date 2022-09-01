package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.EvenDigitSum.getEvenDigitSum;
import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @ParameterizedTest(name="{index} => number={0}, sum={1}")
    @CsvSource({
            "123456789, 20",
            "252, 4",
            "-22, -1",
    })
    void shouldReturnCorrectValue(int number, int result){
        assertTrue(getEvenDigitSum(number)==result);
    }

}