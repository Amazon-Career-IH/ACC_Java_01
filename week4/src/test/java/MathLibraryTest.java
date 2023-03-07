import com.ironhack.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathLibraryTest {


    @BeforeEach
    void setUp() {
        System.out.println("Hola");

    }

    @AfterEach
    void tearDown() {
        System.out.println("Adios");

    }


    @Test
    void shouldSumTwoPositiveNumbers() {
        // 2 + 2 = 4
        assertEquals(4, MathLibrary.sum(2, 2));
        assertEquals(10, MathLibrary.sum(6, 4));

    }

    @Test
    void shouldSumTwoNegativeNumbers() {
        assertEquals(-10, MathLibrary.sum(-5, -5));
    }

    @Test
    void shouldSumNegativeAndPositiveNumbers() {
        // -5  + 10
        assertEquals(5, MathLibrary.sum(-5, 10));

    }

    @Test
    void shouldSumTenToEachInAnArray() {

        int[] numbers = {1, 2, 3, 4,5};
        int[] expected =  {11, 12, 13, 14, 15};

        assertArrayEquals(expected, MathLibrary.sumTenToArray(numbers));


    }

    @Test void shouldSumLargestIntegerPlusOne() {
        int maxValue = 2147483647;
        int one = 1;
        //Resultado debería ser: 2147483648

        assertEquals(2147483648l, MathLibrary.sum(maxValue, 1));

    }

}
