package january.medium;

import java.util.HashSet;
import java.util.Set;

public class NumMagicSquaresInside {
    public int numMagicSquaresInside(int[][] grid) {

        int ans = 0;
        Set<String> seen = new HashSet<>();

        for (int sr = 2 ; sr < grid.length ; sr++){
            for (int sc = 2 ; sc < grid[0].length ; sc++){

                HashSet<Integer> set = new HashSet<>();
                boolean poss = true;
                StringBuilder builder = new StringBuilder();

                for (int i = sr-2 ; i <= sr ; i++){
                    for (int j = sc-2 ; j <= sc ; j++){
                        if (set.contains(grid[i][j]) || grid[i][j] > 9 || grid[i][j] < 1){
                            poss = false;
                        }
                        set.add(grid[i][j]);
                    }
                }

                if (!poss){
                    continue;
                }

                int sum = 0;

                sum += grid[sr-2][sc-2];
                sum += grid[sr-1][sc-1];
                sum += grid[sr][sc];

                int sum1 = 0;

                sum1 += grid[sr-2][sc];
                sum1 += grid[sr-1][sc-1];
                sum1 += grid[sr][sc-2];

                if (sum != sum1){
                    continue;
                }

                sum1 = 0;
                int sum2 = 0;
                int sum3 = 0;

                for (int i = sr-2 ; i <= sr ; i++){
                    sum1 += grid[i][sc-2];
                    sum2 += grid[i][sc-1];
                    sum3 += grid[i][sc];
                }

                if (sum1 != sum || sum2 != sum || sum3 != sum){
                    continue;
                }

                sum1 = 0;
                sum2 = 0;
                sum3 = 0;

                for (int i = sc-2 ; i <= sc ; i++){
                    sum1 += grid[sr-2][i];
                    sum2 += grid[sr-1][i];
                    sum3 += grid[sr][i];
                }

                if (sum1 != sum || sum2 != sum || sum3 != sum){
                    continue;
                }

                ans++;

            }
        }

        return ans;

    }
}
