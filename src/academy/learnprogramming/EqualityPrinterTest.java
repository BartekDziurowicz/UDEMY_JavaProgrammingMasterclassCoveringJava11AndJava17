package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static academy.learnprogramming.EqualityPrinter.printEqual;
import static org.junit.jupiter.api.Assertions.*;

class EqualityPrinterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, result={3}")
    @CsvSource({
            "1, 1, 1, All numbers are equal",
            "1, 1, 2, Neither all are equal or different",
            "-1, -1, -1, Invalid Value",
            "1, 2, 3, All numbers are different"
    })
    void shouldCheckAreInputValuesEqualAndPrintCorrectResponse(int a, int b, int c, String output) {
        printEqual(a, b, c);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}