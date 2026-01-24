package january.medium;

import java.util.Arrays;

public class MinPairSum {
    public int minPairSum(int[] nums) {

        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);

        for (int i = 0 ; i < n/2 ; i++){
            ans = Math.max(ans, nums[i] + nums[n-i-1]);
        }

        return ans;

    }
}
