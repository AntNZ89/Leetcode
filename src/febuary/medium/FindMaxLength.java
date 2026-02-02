package febuary.medium;

import java.util.HashMap;
import java.util.Map;

public class FindMaxLength {
    public int findMaxLength(int[] nums) {

        int n = nums.length;
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> pref = new HashMap<>();
        pref.put(0, -1);

        for (int i = 0 ; i < n ; i++){
            sum += nums[i] == 1 ? 1 : -1;

            if (pref.containsKey(sum)){
                ans = Math.max(ans, i - pref.get(sum));
            }
            else {
                pref.put(sum, i);
            }
        }

        return ans;

    }
}
