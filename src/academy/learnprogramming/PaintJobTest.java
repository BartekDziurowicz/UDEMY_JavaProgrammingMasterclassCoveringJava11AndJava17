package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static academy.learnprogramming.PaintJob.getBucketCount;
import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {

    @ParameterizedTest(name="{index} => area: {0}, areaPerBucket: {1}, bucketCount: {2}")
    @CsvSource({
            "3.4, 1.5, 3",
            "6.26, 2.2, 3",
            "3.26, 0.75, 5"
    })
    void shouldCalculateAndReturnCorrectBucketCountOnlyAreaOfWall(double area, double areaPerBucket, int bucketCount){
        assertEquals(getBucketCount(area, areaPerBucket), bucketCount);
    }

    @ParameterizedTest(name="{index} => width: {0}, height: {1}, areaPerBucket: {2}, bucketCount: {3}")
    @CsvSource({
            "-3.4, 2.1, 1.5, -1",
            "3.4, 2.1, 1.5, 5",
            "7.25, 4.3, 2.35, 14"
    })
    void shouldCalculateAndReturnCorrectBucketCountWithoutExtraBucket(double width, double height, double areaPerBucket, int bucketCount){
        assertEquals(getBucketCount(width, height, areaPerBucket), bucketCount);
    }

    @ParameterizedTest(name="{index} => width: {0}, height: {1}, areaPerBucket: {2}, extraBuckets: {3}, bucketCount: {4}")
    @CsvSource({
            "-3.4, 2.1, 1.5, 2, -1",
            "3.4, 2.1, 1.5, 2, 3",
            "2.75, 3.25, 2.5, 1, 3"
    })
    void shouldCalculateAndReturnCorrectBucketCountWithExtraBucket(double width, double height, double areaPerBucket, int extraBuckets, int bucketCount){
        assertEquals(getBucketCount(width, height, areaPerBucket, extraBuckets), bucketCount);
    }

}