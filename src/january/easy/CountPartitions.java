package january.easy;

public class CountPartitions {
    public int countPartitions(int[] nums) {

        int left = 0;
        int right = 0;

        for (int num : nums) right += num;

        left += nums[0];
        right -= nums[0];

        int ans = 0;

        for (int i = 1 ; i < nums.length ; i++){
            if ((right-left) % 2 == 0){
                ans++;
            }
            left += nums[i];
            right -= nums[i];
        }

        return ans;

    }
}
