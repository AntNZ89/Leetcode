package january.medium;

public class MaxMatrixSum {
    public long maxMatrixSum(int[][] matrix) {

        int n = matrix.length;
        int negatives = 0;
        long ans = 0;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                int num = Math.abs(matrix[i][j]);
                ans += num;

                if (matrix[i][j] < 0){
                    negatives++;
                }

                if (num < smallest){
                    smallest = num;
                }

                smallest = Math.min(smallest, num);
            }

        }

        if (negatives % 2 == 0){
            return ans;
        }

        return ans - (smallest*2);

    }
}
