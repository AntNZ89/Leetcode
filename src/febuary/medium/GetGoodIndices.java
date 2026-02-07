package febuary.medium;

import java.util.ArrayList;
import java.util.List;

public class GetGoodIndices {
    public List<Integer> getGoodIndices(int[][] variables, int target) {

        List<Integer> ans = new ArrayList<>();
        int n = variables.length;

        for (int i = 0 ; i < n ; i++){
            int a = variables[i][0];
            int b = variables[i][1];
            int c = variables[i][2];
            int m = variables[i][3];

            long inner = a;

            for (int j = 0 ; j < b-1 ; j++){
                inner *= a;
                inner %=  10;
            }

            inner %= 10;
            long outer = inner;

            for (int j = 0 ; j < c-1 ; j++){
                outer *= inner;
                outer %= m;
            }

            outer %= m;

            if ((int)outer == target){
                ans.add(i);
            }
        }

        return ans;

    }
}
