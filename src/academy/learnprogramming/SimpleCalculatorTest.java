package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    void getAdditionResult() {
        //given
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        //when
        double additionResult = simpleCalculator.getAdditionResult();
        //then
        assertEquals(additionResult, 9);
    }

    @Test
    void getSubtractionResult() {
        //given
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        //when
        double subtractionResult = simpleCalculator.getSubtractionResult();
        //then
        assertEquals(subtractionResult, 1);
    }

    @Test
    void getMultiplicationResult() {
        //given
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        //when
        double multiplicationResult = simpleCalculator.getMultiplicationResult();
        //then
        assertEquals(multiplicationResult, 0.0);
    }

    @Test
    void getDivisionResult() {
        //given
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        //when
        double divisionResult = simpleCalculator.getDivisionResult();
        //then
        assertEquals(divisionResult, 0.0);
    }
}