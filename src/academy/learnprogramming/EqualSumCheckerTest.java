package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}, result={3}")
    @CsvSource({
            "1, 1, 1, false",
            "1, 1, 2, true",
            "-1, 1, 0, true",
    })
    void shouldCompareTwoDoublesTo3rdDecimalPlaces(int a, int b, int sum, boolean expected) {
        assertEquals(EqualSumChecker.hasEqualSum(a, b, sum), expected);
    }

}