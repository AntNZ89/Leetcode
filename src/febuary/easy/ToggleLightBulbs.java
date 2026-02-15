package febuary.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToggleLightBulbs {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new HashSet<>();

        for (int val : bulbs){
            if (set.contains(val)){
                set.remove(val);
            }
            else {
                set.add(val);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 1 ; i < 101 ; i++){
            if (set.contains(i)){
                ans.add(i);
            }
        }

        return ans;

    }
}
