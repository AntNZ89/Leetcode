package febuary.medium;

import java.util.PriorityQueue;

public class DiagonalSort {
    public int[][] diagonalSort(int[][] mat) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = mat.length;
        int m = mat[0].length;

        for (int c = 0 ; c < m ; c++){
            int row = 0;
            int col = c;
            while (col < m && row < n){
                q.offer(mat[row][col]);
                col++;
                row++;
            }
            row = 0;
            col = c;
            while (col < m && row < n){
                mat[row][col] = q.poll();
                row++;
                col++;
            }
        }

        for (int r = 1 ; r < n ; r++){
            int col = 0;
            int row = r;
            while (col < m && row < n){
                q.offer(mat[row][col]);
                col++;
                row++;
            }
            col = 0;
            row = r;
            while (col < m && row < n){
                mat[row][col] = q.poll();
                col++;
                row++;
            }
        }

        return mat;

    }
}
