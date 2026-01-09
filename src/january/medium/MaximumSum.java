package january.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSum {
    public int maximumSum(int[] nums) {

        List<Integer> div0 = new ArrayList<>();
        List<Integer> div1 = new ArrayList<>();
        List<Integer> div2 = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = nums.length-1 ; i >= 0 ; i--){
            int num = nums[i];
            if (num % 3 == 0){
                div0.add(num);
            }
            else if (num % 3 == 1){
                div1.add(num);
            }
            else {
                div2.add(num);
            }
        }

        int ans = 0;

        if (div0.size() > 2){
            ans = Math.max(ans, div0.get(0) + div0.get(1) + div0.get(2));
        }
        if (div1.size() > 2){
            ans = Math.max(ans, div1.get(0) + div1.get(1) + div1.get(2));
        }
        if (div2.size() > 2){
            ans = Math.max(ans, div2.get(0) + div2.get(1) + div2.get(2));
        }
        if (div0.size() > 0 && div1.size() > 0 && div2.size() > 0){
            ans = Math.max(ans, div0.get(0) + div1.get(0) + div2.get(0));
        }


        return ans;


    }
}
