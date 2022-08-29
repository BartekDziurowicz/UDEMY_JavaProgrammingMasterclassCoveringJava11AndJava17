package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToYearAndDaysCalculatorTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest(name = "{index} => a={0}, result={1}")
    @CsvSource({
            "525600, 525600 min = 1 y and 0 d",
            "1051200, 1051200 min = 2 y and 0 d",
            "561600, 561600 min = 1 y and 25 d"
    })
    void shouldConvertMinutesToYearAndDay(long minutes, String output) {
        MinutesToYearAndDaysCalculator.printYearsAndDays(minutes);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}