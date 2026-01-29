package january.medium;

public class GetSumAbsoluteDifference {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int right = 0;
        for (int num : nums){
            right += num;
        }
        int left = 0;

        int[] ans = new int[n];

        for (int i = 0 ; i < n ; i++){
            ans[i] = right - (nums[i]*(n-i)) + Math.abs(left - nums[i]*i);
            left += nums[i];
            right -= nums[i];
        }

        return ans;

    }
}
