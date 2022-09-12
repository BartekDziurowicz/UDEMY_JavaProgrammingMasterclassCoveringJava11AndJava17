package academy.learnprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "3.5, 2.75, 4.0, 38.5",
            "1.5, 5.4, 4.5, 36.45"
    })
    void getTotalCost(double cost, double width, double length, double totalCost) {
        //given
        Carpet carpet = new Carpet(cost);
        Floor floor = new Floor(width, length);
        Calculator calculator = new Calculator(floor, carpet);
        //when
        //then
        assertEquals(calculator.getTotalCost(), totalCost);
    }
}