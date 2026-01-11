package january.medium;

import java.util.HashSet;

public class CenteredSubArrays {
    public int centeredSubarrays(int[] nums) {

        int n = nums.length;
        int ans = 0;

        for (int i = 0 ; i < n ; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;
            for (int j = i ; j < n ; j++){
                set.add(nums[j]);
                sum += nums[j];
                if (set.contains(sum)){
                    ans++;
                }
            }
        }

        return ans;

    }
}
