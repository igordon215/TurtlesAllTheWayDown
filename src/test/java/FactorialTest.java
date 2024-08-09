import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        // Given
        int input1 = 0;

        // When
        Long result1 = Factorial.Factorial(input1);

        // Then
        System.out.println("Factorial of " + input1 + " is: " + result1);
        assertEquals(Long.valueOf(1), result1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        // Given
        int input2 = 5;

        // When
        Long result1 = Factorial.Factorial(input2);

        // Then
        System.out.println("Factorial of " + input2 + " is: " + result1);
        assertEquals(Long.valueOf(120), result1);
    }
}