package febuary.medium;

public class NumSubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int n = nums.length;
        int ans = 0;
        int sum = 0;
        int[] pref = new int[n+1];
        pref[0] = 1;

        for (int i = 0 ; i < n ; i++){
            sum += nums[i];

            if (sum-goal >= 0){
                ans += pref[sum-goal];
            }

            pref[sum]++;
        }

        return ans;

    }
}
