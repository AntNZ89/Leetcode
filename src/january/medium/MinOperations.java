package january.medium;
import java.util.HashMap;

public class MinOperations {
    public int minOperations(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int dupes = 0;

        for (int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2){
                dupes++;
            }
        }

        if (dupes == 0){
            return 0;
        }

        if (nums.length <= 3){
            return 1;
        }

        int n = nums.length;

        for (int i = 0 ; i < nums.length ; i += 3){

            if (n < 3){
                return (nums.length-1)/3 + 1;
            }
            n -= 3;

            map.put(nums[i], map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 1){
                dupes--;
            }
            map.put(nums[i+1], map.get(nums[i+1]) - 1);
            if (map.get(nums[i+1]) == 1){
                dupes--;
            }
            map.put(nums[i+2], map.get(nums[i+2]) - 1);
            if (map.get(nums[i+2]) == 1){
                dupes--;
            }

            if (dupes == 0){
                return i/3 +1;
            }
        }

        return (nums.length-1)/3 + 1;

    }
}
