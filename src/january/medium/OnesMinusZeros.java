package january.medium;

public class OnesMinusZeros {
    public int[][] onesMinusZeros(int[][] grid) {

        int[] rows1 = new int[grid.length];
        int[] cols1 = new int[grid[0].length];
        int[] rows0 = new int[grid.length];
        int[] cols0 = new int[grid[0].length];

        for (int r = 0 ; r < rows1.length ; r++){
            for (int c = 0 ; c < cols1.length ; c++){
                if (grid[r][c] == 1){
                    rows1[r]++;
                    cols1[c]++;
                }
                else {
                    rows0[r]++;
                    cols0[c]++;
                }
            }
        }

        int[][] ans = new int[grid.length][grid[0].length];

        for (int r = 0 ; r < rows1.length ; r++){
            for (int c = 0 ; c < cols1.length ; c++){
                ans[r][c] = rows1[r] + cols1[c] - rows0[r] - cols0[c];
            }
        }

        return ans;

    }
}
