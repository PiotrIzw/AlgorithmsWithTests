package algorithms.productofnumbers;

import java.util.List;

public class ProductOfNumbers {

    public int[] spot(List<Integer> a, int target) throws AppException {

        for(Integer integerX : a){
            int x = integerX;

            for (Integer integerY : a){
                int y = integerY;
                if(x * y == target){
                    int indexOfX = a.indexOf(x);
                    int indexOfY = a.indexOf(y);
                    int[] arr = {indexOfX, indexOfY};
                    return arr;
                }
            }
        }
        throw new AppException("Not found");
    }
}
