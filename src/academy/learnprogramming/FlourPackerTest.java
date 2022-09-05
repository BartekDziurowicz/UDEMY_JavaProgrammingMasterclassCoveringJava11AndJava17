package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.FlourPacker.canPack;
import static org.junit.jupiter.api.Assertions.*;

class FlourPackerTest {

    @ParameterizedTest(name="{index} => bigCount: {0}, smallCount: {1}, goal: {3}, canPack: {4}")
    @CsvSource({
            "1, 0, 4, false",
            "1, 0, 5, true",
            "0, 5, 4, true",
            "2, 2, 11, true",
            "-3, 2, 12, false"
    })
    void shouldReturnCorrectValue(int smallCount, int bigCount, int goal, boolean result) {
        assertEquals(canPack(smallCount, bigCount, goal), result);
    }

}