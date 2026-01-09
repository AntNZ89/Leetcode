package january.medium;

import java.util.HashMap;
import java.util.HashSet;

public class MinCost {
    public long minCost(String s, int[] cost) {

        HashMap<Character, Long> map = new HashMap<>();
        HashSet<Character> seen = new HashSet<>();
        boolean dupe = false;
        long max = 0;

        for (int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), (long)0)+(long)cost[i]);
            max += cost[i];
            seen.add(s.charAt(i));
        }

        long min = 0;

        for (long val : map.values()){
            min = Math.max(min, val);
        }

        if (seen.size() < 2){
            return 0;
        }

        return max - min;

    }
}
