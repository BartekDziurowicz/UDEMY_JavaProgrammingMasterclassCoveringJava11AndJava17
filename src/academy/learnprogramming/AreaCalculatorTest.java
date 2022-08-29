package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static academy.learnprogramming.AreaCalculator.area;
import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void shouldReturnZero() {
        assertEquals(area(0), 0);
        assertEquals(area(0, 0), 0);
        assertEquals(area(0, 1), 0);
        assertEquals(area(1, 0), 0);
    }

    @Test
    void shouldReturnMinusOne() {
        assertEquals(area(-1), -1);
        assertEquals(area(0, -1), -1);
        assertEquals(area(-1, 0), -1);
        assertEquals(area(-1, -1), -1);
    }

    @Test
    void shouldReturnPositiveValue() {
        assertTrue(area(1)>0);
        assertTrue(area(0.01)>0);
        assertTrue(area(100)>0);
    }

}