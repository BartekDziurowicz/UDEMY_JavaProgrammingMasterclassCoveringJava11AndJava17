package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static academy.learnprogramming.NumberInWords.numberToWords;
import static org.junit.jupiter.api.Assertions.*;

class NumberInWordsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest(name="{index} => number: {0}, inWords: {1}")
    @CsvSource({
            "123, One Two Three",
            "1010, One Zero One Zero",
            "1000, One Zero Zero Zero",
            "-12, Invalid Value"
    })
    void shouldReturnCorrectValue(int number, String output) {
        numberToWords(number);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}