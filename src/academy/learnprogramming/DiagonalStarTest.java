package academy.learnprogramming;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static academy.learnprogramming.DiagonalStar.printSquareStar;
import static org.junit.jupiter.api.Assertions.*;

class DiagonalStarTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldPrintInvalidValue() {
        printSquareStar(4);
        assertEquals("Invalid Value\n", outputStreamCaptor.toString());
    }

    @Test
    void shouldPrintSquareStar() {
        printSquareStar(5);
        assertEquals("*****\n** **\n* * *\n** **\n*****\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}