package algorithms.spiralmatrix;

public class SpiralMatrix {

    public void printMatrixInSpiralForm(int m, int n, int[][] arr) {
        try {
            if(m == 0 || n == 0){
                throw new IllegalArgumentException("Values m and n must be greater than 0");
            }
            int i, k = 0, l = 0;

            int count = 0;

            int total = m * n;

            while (k < m && l < n) {
                if (count == total)
                    break;

                for (i = k; i < m; ++i) {
                    System.out.print(arr[i][l] + " ");
                    count++;
                }
                l++;

                if (count == total)
                    break;

                for (i = l; i < n; ++i) {
                    System.out.print(arr[m - 1][i] + " ");
                    count++;
                }
                m--;

                if (count == total)
                    break;

                if (k < m) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.print(arr[i][n - 1] + " ");
                        count++;
                    }
                    n--;
                }

                if (count == total)
                    break;

                if (l < n) {
                    for (i = n - 1; i >= l; --i) {
                        System.out.print(arr[k][i] + " ");
                        count++;
                    }
                    k++;
                }
            }
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

}
