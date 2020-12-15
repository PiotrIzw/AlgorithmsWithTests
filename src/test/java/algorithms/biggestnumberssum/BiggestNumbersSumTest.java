package algorithms.biggestnumberssum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BiggestNumbersSumTest {

    private BiggestNumbersSum biggestNumbersSum = new BiggestNumbersSum();
    private List<Integer> list = new ArrayList<>();

    @BeforeEach
    void setUp() {
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(10);
    }

    @AfterEach
    void tearDown() {
        list.clear();
    }

    @Test
    void shouldReturnTrueWhenSumOfThreeBiggestNumbersIsEqual300(){
        list.add(100);
        list.add(100);
        list.add(100);

        Assertions.assertEquals(300, biggestNumbersSum.maxTriplet(list));
    }

    @Test
    void shouldReturnTrueWhenSumOfThreeBiggestNumbersIsEqual100(){
        list.add(33);
        list.add(34);
        list.add(33);

        Assertions.assertEquals(100, biggestNumbersSum.maxTriplet(list));
    }

}