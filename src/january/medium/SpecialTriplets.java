package january.medium;

import java.util.HashMap;

public class SpecialTriplets {
    public int specialTriplets(int[] nums) {

        int ans = 0;
        int mod = 1000000007;
        HashMap<Integer, Integer> freqNext = new HashMap<>();
        HashMap<Integer, Integer> freqPrev = new HashMap<>();

        for (int num : nums){
            freqNext.put(num, freqNext.getOrDefault(num, 0) + 1);
        }

        for (int j : nums){
            freqNext.put(j , freqNext.get(j)-1);
            int i = freqPrev.getOrDefault(j*2, 0);
            int k = freqNext.getOrDefault(j*2, 0);
            ans = (int)((ans + 1L * i*k) % mod);
            freqPrev.put(j , freqPrev.getOrDefault(j, 0) + 1);
        }

        return ans;

    }
}
