import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    public void TestGetGCD1() {
        //Given
        Long x1 = 10L;
        Long y1 = 8L;
        Long expected = 2L;
        //When
        Long actual = GCD.getGCD1(x1,y1);
        //Then
        System.out.println("GCD of " + x1 + " and " + y1 + " is: " + GCD.getGCD2(x1, y1));
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestGetGCD2() {
        //Given
        Long x2 = 12L;
        Long y2 = 10L;
        Long expected = 2L;
        //When
        Long actual = GCD.getGCD2(x2,y2);
        //Then
        System.out.println("GCD of " + x2 + " and " + y2 + " is: " + GCD.getGCD2(x2, y2));
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGCDTest() {
        long p = 1000000L;
        long q = 500000L;

        // Time getGCD1
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            GCD.getGCD1(p, q);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Time getGCD2
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            GCD.getGCD2(p, q);
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Compare durations
        System.out.println("Time for getGCD1: " + duration1 + " ns");
        System.out.println("Time for getGCD2: " + duration2 + " ns");

        Assert.assertTrue("getGCD2 should be slower than getGCD1", duration2 > duration1);
    }


}