package january.medium;

import java.util.HashSet;

public class MinOperations2 {
    public int minOperations(int[] nums, int[] target) {

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int ans = 0;

        for (int i = 0 ; i < n ; i++){
            if (nums[i] != target[i]){
                set.add(nums[i]);
            }
        }

        return set.size();

    }
}
