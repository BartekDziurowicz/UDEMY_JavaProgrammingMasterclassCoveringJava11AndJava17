package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WallTest {

    @ParameterizedTest(name="{index} => wall area: {4}")
    @CsvSource({
            "-1, -1, 0, 0, 0",
            "-1, 0, 0, 0, 0",
            "0, -1, 0, 0, 0",
            "0, 0, 0, 0, 0",
            "-1, 1, 0, 1, 0",
            "1, -1, 1, 0, 0",
            "1, 0, 1, 0, 0",
            "0, 1, 0, 1, 0",
            "1, 1, 1, 1, 1"
    })
    void shouldGivesCorrectValues(double width, double height, double widthOut, double heightOut, double area){
        //given
        Wall wall = new Wall(width, height);
        //when
        //then
        assertEquals(wall.getWidth(), widthOut);
        assertEquals(wall.getHeight(), heightOut);
        assertEquals(wall.getArea(), area);
    }


}