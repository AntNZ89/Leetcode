package january.easy;

import java.util.List;

public class MinBitwiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0 ; i < n ; i++){
            int num = nums.get(i);
            boolean can = true;
            for (int j = 0 ; j <= num ; j++){
                if (num == (j | (j+1))){
                    ans[i] =  j;
                    can = false;
                    break;
                }
            }

            if (can) ans[i] = -1;

        }

        return ans;

    }
}
