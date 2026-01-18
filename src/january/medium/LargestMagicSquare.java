package january.medium;

public class LargestMagicSquare {
    public int largestMagicSquare(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] prefR = new int[n+1][m+1];
        int[][] prefC = new int[n+1][m+1];

        for (int r = 0 ; r < n ; r++){
            for (int c = 0 ; c < m ; c++){
                prefR[r+1][c+1] = prefR[r+1][c] + grid[r][c];
            }
        }

        for (int c = 0 ; c < m ; c++){
            for (int r = 0 ; r < n ; r++){
                prefC[r+1][c+1] = prefC[r][c+1] + grid[r][c];
            }
        }

        int ans = 1;

        for (int r = 0 ; r < n ; r++){
            for (int c = 0 ; c < m ; c++){
                for (int i = 1 ; i < Math.min(n-r, m-c) ; i++){

                    boolean can = true;

                    int sum = 0;
                    int it = 0;
                    while (it <= i){
                        sum += grid[r+it][c+it];
                        it++;
                    }

                    it = 0;
                    int tempSum = 0;
                    while (it <= i){
                        tempSum += grid[r+i-it][c+it];
                        it++;
                    }

                    if (sum != tempSum){
                        can = false;
                        continue;
                    }

                    for (int a = r ; a <= r+i ; a++){
                        if (sum != (prefR[a+1][c+i+1] - prefR[a+1][c])){
                            can = false;
                            break;
                        }
                    }

                    if (!can) continue;

                    for (int b = c ; b <= c+i ; b++){
                        if (sum != (prefC[r+i+1][b+1] - prefC[r][b+1])){
                            can = false;
                            break;
                        }
                    }

                    if (!can) continue;

                    ans = Math.max(ans, i+1);

                }
            }
        }

        return ans;

    }
}
