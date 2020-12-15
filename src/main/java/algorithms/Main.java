package algorithms;

import algorithms.biggestnumberssum.BiggestNumbersSum;
import algorithms.productofnumbers.AppException;
import algorithms.productofnumbers.ProductOfNumbers;
import algorithms.sorting.*;
import algorithms.spiralmatrix.SpiralMatrix;
import algorithms.substring.Substring;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws AppException {
        System.out.println("Exercise 1");

        Random number = new Random();
        int[] arr = new int[30000];
        for (int i = 0; i < 30000; i++){
            arr[i] = number.nextInt();
        }
        Context arrType = new Context();
        int[] arrPes = arrType.arrPesimistic(arr);
        int[] arrOpt = arrType.arrOptimistic(arr);
        Context context = new Context(new HeapSort());


        long startTimeMills = System.currentTimeMillis();

        context.executeStrategy(arr);
        long stopTimeMills = System.currentTimeMillis();
        double elapsedSeconds = (double) (stopTimeMills - startTimeMills) / 1000;
        System.out.println("Elapsed seconds: (normal)" + elapsedSeconds);

        startTimeMills = System.currentTimeMillis();

        context.executeStrategy(arrPes);
        stopTimeMills = System.currentTimeMillis();
        elapsedSeconds = (double) (stopTimeMills - startTimeMills) / 1000;
        System.out.println("Elapsed seconds: (pesimistic)" + elapsedSeconds);

        context.executeStrategy(arrOpt);
        stopTimeMills = System.currentTimeMillis();
        elapsedSeconds = (double) (stopTimeMills - startTimeMills) / 1000;
        System.out.println("Elapsed seconds: (optimistic)" + elapsedSeconds);


        System.out.println();
        System.out.println("Exercise 2");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(10);

        ProductOfNumbers numbers = new ProductOfNumbers();

        int[] result = numbers.spot(list, 30);
        System.out.println("Position of the element: " + result[0] + ", value: " + list.get(result[0]));
        System.out.println("Position of the element: " + result[1] + ", value: " + list.get(result[1]));

        System.out.println();
        System.out.println("Exercise 3");
        Substring words = new Substring();
        System.out.println("Number of repetitions of first parameter: " + words.substring("abcd", "abcdab"));

        System.out.println();
        System.out.println("Exercise 4");
        BiggestNumbersSum sum = new BiggestNumbersSum();
        System.out.println("Sum of 3 biggest numbers in list: " + sum.maxTriplet(list));

        System.out.println();
        System.out.println("Exercise 5");
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] arrMatrix = {
                { 1,  2,  3,  4},
                { 6,  7,  8,  9},
                {11, 12, 13, 14},
                {16, 17, 18, 19},
                {21, 22, 23, 24}
        };
        spiralMatrix.printMatrixInSpiralForm(5,4, arrMatrix);

    }

}
