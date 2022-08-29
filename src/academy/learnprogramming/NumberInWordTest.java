package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static academy.learnprogramming.NumberInWord.printNumberInWord;
import static org.junit.jupiter.api.Assertions.*;

class NumberInWordTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest(name="{index} => input {0}, output {1}")
    @CsvSource({
            "0, ZERO",
            "1, ONE",
            "2, TWO",
            "3, THREE",
            "4, FOUR",
            "5, FIVE",
            "6, SIX",
            "7, SEVEN",
            "8, EIGHT",
            "9, NINE",
            "10, OTHER"
    })
    void shouldReturnCorrectValueFromSwitch(int a, String output) {
        printNumberInWord(a);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}