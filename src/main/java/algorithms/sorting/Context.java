package algorithms.sorting;

public class Context {
    private Strategy strategy;

    public Context(){
        super();
    }
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr){
        strategy.sort(arr);
    }

    public int[] arrPesimistic(int[] arr){
        int n = arr.length, i, j, temp;
            for (i = 0; i < ( n - 1 ); i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j+1])
                    {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
            return arr;
        }

    public int[] arrOptimistic(int[] arr) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
    return arr;
    }


    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
