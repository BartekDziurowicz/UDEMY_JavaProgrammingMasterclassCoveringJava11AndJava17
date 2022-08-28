package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MegaByteConverterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest
    @CsvSource({
            "2500, 2500 KB = 2MB and 452 KB",
            "-1024, Invalid value",
            "5000, 5000 KB = 4MB and 904 KB"
    })
    void shouldConvertKilometersToMiles(int kb, String output) {
        MegaByteConverter.printMegaBytesAndKiloBytes(kb);
        assertEquals(output+"\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}