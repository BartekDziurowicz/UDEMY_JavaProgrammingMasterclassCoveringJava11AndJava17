package academy.learnprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @ParameterizedTest(name="{index} => input {0}, cost {1}")
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1"
    })
    void getCost(double cost, double costOut) {
        //given
        Carpet carpet = new Carpet(cost);
        //when
        //then
        assertEquals(carpet.getCost(), costOut);
    }
}