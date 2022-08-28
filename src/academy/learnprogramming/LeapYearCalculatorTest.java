package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    @ParameterizedTest
    @ValueSource(ints={-1600, 1700, 1800, 1900, 2017, 2100, 2200, 2300, 2500, 2600})
    void shouldReturnFalse(int year) {
        assertFalse(LeapYearCalculator.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints={1600, 2000, 2400})
    void shouldReturnTrue(int year) {
        assertTrue(LeapYearCalculator.isLeapYear(year));
    }

}