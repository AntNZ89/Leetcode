package january.hard;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class IsPossible {
    public boolean isPossible(int[] target) {

        int n = target.length;
        int count1 = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        HashSet<Integer> seen = new HashSet<>();

        for (int num : target){
            if (num == 1) count1++;
            q.offer(num);
            sum += num;
            if (seen.contains(num) && num != 1){
                return false;
            }
            seen.add(num);
        }

        if (n == count1) return true;
        if (n == 1 && target[0] != 1) return false;

        while (!q.isEmpty()){

            int max = q.poll();
            sum -= max;
            int num = max - sum;

            if (!q.isEmpty() && num > q.peek()){

                if (sum == 1){
                    num = 1;
                }
                else {
                    num = max % sum;
                }
            }

            if (num == 1){
                count1++;
            }
            else if (num < 1){
                return false;
            }
            else {
                q.offer(num);
            }

            if (count1 == n) return true;
            sum += num;

        }

        return false;

    }
}
