package january.easy;

import java.util.HashSet;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }

        return 0;

    }
}
