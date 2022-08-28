package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @ParameterizedTest(name = "{index} => a={0}, b={1}, areEqual={2}")
    @CsvSource({
            "-3.1756, -3.175, true",
            "3.175, 3.176, false",
            "3.0, 3.0, true",
            "-3.123, 3.123, false"
    })
    void shouldCompareTwoDoublesTo3rdDecimalPlaces(double a, double b, boolean expected) {
        assertEquals(DecimalComparator.areEqualByThreeDecimalPlaces(a, b), expected);
    }

}