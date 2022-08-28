package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    @ParameterizedTest
    @CsvSource({
          "1.5, 1", "10.25, 6", "-5.6, -1", "25.42, 16", "75.114, 47"
    })
    void shouldConvertKilometersToMiles(double km, long ml) {
        assertEquals(SpeedConverter.toMilesPerHour(km), ml);
    }

}