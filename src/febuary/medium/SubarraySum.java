package febuary.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> pref = new HashMap<>();
        pref.put(0, 1);

        for (int i = 0 ; i < n ; i++){
            sum += nums[i];

            if (pref.containsKey(sum-k)){
                ans += pref.get(sum-k);
            }

            pref.put(sum, pref.getOrDefault(sum, 0) + 1);
        }

        return ans;

    }
}
