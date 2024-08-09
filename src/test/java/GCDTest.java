import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void TestGetGCD1() {
        //Given
        Long p = 10L;
        Long q = 8L;
        Long expected = 2L;
        //When
        Long actual = GCD.getGCD1(p,q);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void TestGetGCD2() {




    }


}