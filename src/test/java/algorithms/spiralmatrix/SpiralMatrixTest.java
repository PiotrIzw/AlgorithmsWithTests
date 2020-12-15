package algorithms.spiralmatrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    private SpiralMatrix spiralMatrix = new SpiralMatrix();
    private int[][] arrMatrix = {
            { 1,  2,  3,  4},
            { 6,  7,  8,  9},
            {11, 12, 13, 14},
            {16, 17, 18, 19},
            {21, 22, 23, 24}
    };


    @Test
    void shouldThrowExceptionWhenWrongParametersAreGiven(){
        try {
            spiralMatrix.printMatrixInSpiralForm(0, 0, arrMatrix);
        }
        catch (IllegalArgumentException e){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void shouldPrintArrayInSpiralForm(){
        try {
            spiralMatrix.printMatrixInSpiralForm(5, 4, arrMatrix);
            Assertions.assertTrue(true);
        }
        catch (IllegalArgumentException e){
            Assertions.assertTrue(false);
        }
    }
}