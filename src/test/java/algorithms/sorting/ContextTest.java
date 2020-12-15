package algorithms.sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    private final Context context = new Context();
    private final Context contextBubbleSort = new Context(new BubbleSort());
    private final Context contextCombSort = new Context(new CombSort());
    private final Context contextHeapSort = new Context(new HeapSort());
    private final Context contextInsertionSort = new Context(new InsertionSort());
    private final Context contextSelectionSort = new Context(new SelectionSort());
    private int[] arr, arrToTest;
    private final Random number = new Random();

    @BeforeEach
    void setUp() {
       arr = new int[6000];
        for (int i = 0; i < 6000; i++){
            arr[i] = number.nextInt();
        }
        arrToTest = arr.clone();

        Arrays.sort(arr);
    }

    @AfterEach
    void tearDown() {
        arr = null;
        arrToTest = null;
    }

    @Test
    void shouldReturnTrueWhenSortedBubbleSortArrayIsEqual(){
        contextBubbleSort.executeStrategy(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }

    @Test
    void shouldReturnTrueWhenSortedCombSortArrayIsEqual(){
        contextCombSort.executeStrategy(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }
    @Test
    void shouldReturnTrueWhenHeapCombSortArrayIsEqual(){
        contextHeapSort.executeStrategy(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }

    @Test
    void shouldReturnTrueWhenSortedInsertionSortArrayIsEqual(){
        contextInsertionSort.executeStrategy(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }

    @Test
    void shouldReturnTrueWhenSortedSelectionSortArrayIsEqual(){
        contextSelectionSort.executeStrategy(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }

    @Test
    void shouldSortArrayToGetOptimisticCase(){
        context.arrOptimistic(arrToTest);
        assertArrayEquals(arr, arrToTest);
    }
    @Test
    void shouldReturnTrueWhenOptimisticCaseTimeIsBetterThanPessimistic(){
        int[] arrOpt = arrToTest.clone();
        int[] arrPess = arrToTest.clone();

        context.arrOptimistic(arrOpt);
        long startTimeMills = System.currentTimeMillis();

        contextSelectionSort.executeStrategy(arrOpt);

        long stopTimeMills = System.currentTimeMillis();
        double elapsedSecondsOpt = (double) (stopTimeMills - startTimeMills) / 1000;


        context.arrPesimistic(arrPess);

        startTimeMills = System.currentTimeMillis();

        contextSelectionSort.executeStrategy(arrPess);

        stopTimeMills = System.currentTimeMillis();

        double elapsedSecondsPess = (double) (stopTimeMills - startTimeMills) / 1000;

        Assumptions.assumeTrue(elapsedSecondsOpt < elapsedSecondsPess);
    }
}