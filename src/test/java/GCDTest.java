import org.junit.Assert;
import org.junit.jupiter.api.Test;

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


}