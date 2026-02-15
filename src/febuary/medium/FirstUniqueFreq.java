package febuary.medium;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueFreq {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer, Integer> map1 = new HashMap<>();

        for (int num : nums){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> map2 = new HashMap<>();

        for (int val : map1.values()){
            map2.put(val, map2.getOrDefault(val, 0) + 1);
        }

        for (int num : nums){
            int freq = map1.get(num);
            if (map2.get(freq) == 1) return num;
        }

        return -1;

    }
}
