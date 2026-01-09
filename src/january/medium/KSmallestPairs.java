package january.medium;

import java.util.*;

public class KSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0){
            return ans;
        }

        Queue<int[]> q = new PriorityQueue<>(
                (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        for (int i = 0 ; i < Math.min(nums1.length, k) ; i++){
            q.offer(new int[]{i, 0});
        }


        while (k-- > 0 && !q.isEmpty()){
            int i = q.peek()[0];
            int j = q.poll()[1];

            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if (j+1 < nums2.length){
                q.offer(new int[]{i, j+1});
            }

        }

        return ans;

    }
}
