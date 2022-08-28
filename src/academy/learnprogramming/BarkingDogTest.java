package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarkingDogTest {

    @ParameterizedTest
    @CsvSource({
            "true, 1, true",
            "false, 2, false",
            "true, 8, false",
            "true, -1, false"
    })
    void shouldConvertKilometersToMiles(boolean barking, int hour, boolean expected) {
        assertEquals(BarkingDog.shouldWakeUp(barking, hour), expected);
    }

}