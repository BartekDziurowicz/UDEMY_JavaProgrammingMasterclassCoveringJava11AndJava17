package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.SumOdd.sumOdd;
import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {

    @ParameterizedTest(name="{index} => start={0}, end={1}, sumOdd={2}")
    @CsvSource({
            "1, 100, 2500",
            "-1, 100, -1",
            "100, 100, 0",
            "13, 13, 13",
            "100, -100, -1",
            "100, 1000, 247500"
    })
    void shouldReturnCorrectValue(int start, int end, int result){
        assertTrue(sumOdd(start, end)==result);
    }

}