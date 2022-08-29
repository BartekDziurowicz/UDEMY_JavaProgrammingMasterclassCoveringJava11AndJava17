package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.NumberOfDaysInMonth.getDaysInMonth;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @ParameterizedTest(name="{index} => month {0}, year {1}, result {2}")
    @CsvSource({
            "1, 2020, 31",
            "2, 2020, 29",
            "2, 2018, 28",
            "-1, 2020, -1",
            "1, -2020, -1"
    })
    void shouldReturnCorrectDaysInMonthValue(int month, int year, int result) {
        assertTrue(getDaysInMonth(month, year)==result);
    }

}