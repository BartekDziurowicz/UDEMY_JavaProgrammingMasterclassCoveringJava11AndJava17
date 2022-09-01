package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.SharedDigit.hasSharedDigit;
import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @ParameterizedTest(name="{index} => a={0}, b={1}, result={2}")
    @CsvSource({
            "12, 23, true",
            "9, 99, false",
            "15, 55, true",
    })
    void shouldReturnCorrectValue(int a, int b, boolean result){
        assertTrue(hasSharedDigit(a, b)==result);
    }

}