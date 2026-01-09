package january.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinLength {
    public int minLength(int[] nums, int k) {

        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        int left = 0;
        int sum = 0;
        int ans = n;
        boolean swap = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < n ; i++){

            if (ans == 1 && swap){
                return 1;
            }

            q.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) == 1){
                sum += nums[i];
            }

            if (sum >= k){
                ans = Math.min(ans, i+1-left);
                swap = true;
            }

            while (q.size() != 0 && ((sum-q.peek()) >= k || (sum >= k && map.get(q.peek()) > 1))){

                map.put(q.peek(), map.get(q.peek()) - 1);

                if (map.get(q.peek()) == 0){
                    sum -= q.peek();
                }

                q.poll();
                left++;
                ans = Math.min(ans, i+1-left);
            }
        }


        if (!swap){
            return -1;
        }
        return ans;

    }
}
