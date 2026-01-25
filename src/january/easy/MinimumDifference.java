package january.easy;

import java.util.Arrays;

public class MinimumDifference {
    public int minimumDifference(int[] nums, int k) {

        int n = nums.length;
        Arrays.sort(nums);

        if (n == 1) return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0 ; i <= n - k ; i++){
            ans = Math.min(ans, nums[i+k-1]-nums[i]);
        }

        return ans;

    }
}
