package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

    @ParameterizedTest(name="{index} => {0} + {1} = {2}")
    @CsvSource({
            "-1, -1, 0",
            "-1, 0, 0",
            "-1, 1, 0",
            "0, -1, 0",
            "0, 0, 0",
            "0, 1, 0",
            "1, 1, 1"
    })
    void getArea(double x, double y, double area) {
        //given
        Floor floor = new Floor(x, y);
        //when
        //then
        assertEquals(floor.getArea(), area);
    }
}