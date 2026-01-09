package january.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 1 ; i <= nums.length ; i++){
            set.add(i);
        }

        for (int num : nums){
            set.remove(num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int val : set){
            ans.add(val);
        }

        return ans;

    }
}
