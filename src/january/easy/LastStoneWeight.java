package january.easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones){
            q.offer(stone);
        }

        while (q.size() != 1){
            int s1 = q.poll();
            int s2 = q.poll();
            if (s1 != s2) q.offer(Math.abs(s1-s2));
        }
        if (q.size() == 1) return q.poll();
        return 0;

    }
}
