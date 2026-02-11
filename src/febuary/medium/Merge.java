package febuary.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0 ;  i < n ; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            List<Integer> temp = new ArrayList<>();
            while (i < n && end >= intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
                i++;
            }

            list.add(List.of(start, end));
            i--;
        }

        int[][] ans = new int[list.size()][2];

        for (int i = 0 ; i < list.size() ; i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        return ans;


    }
}
