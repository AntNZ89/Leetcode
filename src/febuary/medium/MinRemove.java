package febuary.medium;

import java.util.Arrays;

public class MinRemove {
    public int minRemoval(int[] nums, int k) {

        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int left = 0;

        for (int i = 1 ; i < n ; i++){
            while ((long)nums[left]*k < nums[i] && left < i){
                left++;
            }

            ans = Math.max(ans, i-left+1);
        }

        while ((long)nums[left]*k < nums[n-1] && left < n-1){
            left++;
        }

        ans = Math.max(ans, n-left);

        return n-ans;

    }
}
