import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        // Given
        int input = 0;

        // When
        Long result = Factorial.Factorial(input);

        // Then
        System.out.println("Factorial of " + input + " is: " + result);
        assertEquals(Long.valueOf(1), result);
    }


}