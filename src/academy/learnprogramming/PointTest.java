package academy.learnprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;

    @BeforeEach
    void startUp(){
        point = new Point(6, 5);
    }

    @Test
    void shouldCalculateDistanceFromPointZeroZero() {
        //given
        //when
        //then
        assertEquals(point.distance(), 7.810249675906654);
    }

    @Test
    void shouldCalculateDistanceFromOtherCoordinates() {
        //given
        int x2=2, y2=2;
        //when
        //then
        assertEquals(point.distance(x2, y2), 5.0);
    }

    @Test
    void shouldCalculateDistanceFromOtherPoint() {
        //given
        Point second = new Point(3, 1);
        //when
        //then
        assertEquals(point.distance(second), 5.0);
    }
}