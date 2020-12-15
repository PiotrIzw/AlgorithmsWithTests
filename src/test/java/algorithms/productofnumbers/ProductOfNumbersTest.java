package algorithms.productofnumbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfNumbersTest {
    private List<Integer> list = new ArrayList<>();
    private ProductOfNumbers productOfNumbers = new ProductOfNumbers();
    @BeforeEach
    void setUp() {
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(10);
    }

    @Test
    void shouldReturnTrueWhenMultiplicationOfNumbersIsEqual70(){
        try {
            int[] result = productOfNumbers.spot(list, 70);
            assertEquals((list.get(result[0]) * list.get(result[1])), 70);
        } catch (AppException e) {
            e.printStackTrace();
            fail("Did not found numbers");
        }
    }

    @Test
    void shouldReturnTrueWhenMultiplicationOfNumbersIsEqual30(){
        try {
            int[] result = productOfNumbers.spot(list, 30);
            assertEquals((list.get(result[0]) * list.get(result[1])), 30);
        } catch (AppException e) {
            e.printStackTrace();
            fail("Did not found numbers");
        }
    }

    @Test
    void shouldReturnTrueWhenMultiplicationOfNumbersIsEqual42(){
        try {
            int[] result = productOfNumbers.spot(list, 42);
            assertEquals((list.get(result[0]) * list.get(result[1])), 42);
        } catch (AppException e) {
            e.printStackTrace();
            fail("Did not found numbers");
        }
    }

    @Test
    void shouldReturnTrueWhenExceptionIsThrown(){
        try {
            int[] result = productOfNumbers.spot(list, 308);
            fail("Exception not thrown");
        } catch (AppException e) {
            assertSame("Not found", e.getMessage());

        }
    }

    @AfterEach
    void tearDown() {
        list.clear();
    }
}