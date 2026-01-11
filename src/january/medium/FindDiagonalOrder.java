package january.medium;

import java.util.ArrayList;
import java.util.List;

public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n*m];
        int ind = 0;

        int row = 0;
        int col = 0;
        boolean isRed = true;

        if (n == 1){
            return mat[0];
        }

        if (m == 1){
            for (int i = 0 ; i < n ; i++) ans[i] = mat[i][0];
            return ans;
        }

        for (int c = col ; c < m ; c++){
            int i = 0;

            if (isRed){
                List<Integer> red = new ArrayList<>();
                while (c-i >= 0 && row+i < n){
                    red.add(mat[row+i][c-i]);
                    i++;
                }

                for (int k = red.size()-1 ; k >= 0 ; k--){
                    ans[ind] = red.get(k);
                    ind++;
                }

                isRed = false;
            }
            else {
                while (c-i >= 0 && row+i < n){
                    ans[ind] = mat[row+i][c-i];
                    ind++;
                    i++;
                }
                isRed = true;
            }
        }


        row = 1;
        col = m-1;

        for (int r = row ; r < n ; r++){
            int i = 0;
            if (isRed){
                List<Integer> red = new ArrayList<>();
                while (r+i < n && col-i >= 0){
                    red.add(mat[r+i][col-i]);
                    i++;
                }

                for (int k = red.size()-1 ; k >= 0 ; k--){
                    ans[ind] = red.get(k);
                    ind++;
                }
                isRed = false;
            }
            else {
                while (r+i < n && col-i >= 0){
                    ans[ind] = mat[r+i][col-i];
                    ind++;
                    i++;
                }
                isRed = true;
            }

        }

        return ans;

    }
}
