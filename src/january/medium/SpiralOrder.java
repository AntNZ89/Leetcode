package january.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int size = n * m;

        int top = 0;
        int bottom = 0;
        int right = 0;
        int left = 0;

        int r = 0;
        int c = 0;

        while (ans.size() != size){
            for (int i = c ; i < m-right ; i++){
                ans.add(matrix[r][i]);
                c++;
            }
            c--;
            top++;

            if (ans.size() != size) r++;
            else break;

            for (int i = r ; i < n-bottom ; i++){
                ans.add(matrix[i][c]);
                r++;
            }
            r--;
            right++;

            if (ans.size() != size) c--;
            else break;

            for (int i = c ; i >= left ; i--){
                ans.add(matrix[r][i]);
                c--;
            }
            c++;
            bottom++;

            if (ans.size() != size) r--;
            else break;


            for (int i = r ; i >= top ; i--){
                ans.add(matrix[i][c]);
                r--;
            }
            r++;
            left++;

            if (ans.size() != size) c++;
            else break;

        }

        return ans;

    }
}
