package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.GreatestCommonDivisor.getGreatestCommonDivisor;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @ParameterizedTest(name="{index} => a={0}, b={1}, divisor={2}")
    @CsvSource({
            "25, 15, 5",
            "12, 30, 6",
            "9, 18, -1",
            "81, 153, 9"
    })
    void shouldReturnCorrectValue(int a, int b, int result){
        assertEquals(getGreatestCommonDivisor(a, b), result);
    }

}