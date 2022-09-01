package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static academy.learnprogramming.AllFactors.printFactors;
import static org.junit.jupiter.api.Assertions.*;

class AllFactorsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest(name="{index} => number {0}, factors {1}")
    @CsvSource({
            "6, 1 2 3 6",
            "32, 1 2 4 8 16 32",
            "10, 1 2 5 10",
            "-1, Invalid Value"
    })
    void shouldReturnCorrectValueFromSwitch(int number, String output) {
        printFactors(number);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}