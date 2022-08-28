package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @ParameterizedTest(name = "{index} => age={0}, result=false")
    @ValueSource(ints={12, 20})
    void shouldReturnFalseBecauseValuesAreNotTeen(int age) {
        assertFalse(TeenNumberChecker.isTeen(age));
    }

    @ParameterizedTest(name = "{index} => age={0}, result=true")
    @ValueSource(ints={13, 14, 16, 18, 19})
    void shouldReturnTrueBecauseValuesAreNotTeen(int age) {
        assertTrue(TeenNumberChecker.isTeen(age));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}, result={3}")
    @CsvSource({
            "9, 99, 19, true",
            "23, 15, 42, true",
            "22, 23, 34, false",
    })
    void shouldCheckIsOneOfValueTeenNumber(int a, int b, int c, boolean expected) {
        assertEquals(TeenNumberChecker.hasTeen(a, b, c), expected);
    }

}