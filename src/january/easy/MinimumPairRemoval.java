package january.easy;

import java.util.ArrayList;

public class MinimumPairRemoval {
    public int minimumPairRemoval(int[] nums) {

        int n = nums.length;
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums){
            list.add(num);
        }

        while (!isSorted(list)){
            int sum = Integer.MAX_VALUE;
            int[] ind = new int[2];

            for (int i = 0 ; i < n-1 ; i++){
                if (sum > list.get(i) + list.get(i+1)){
                    sum = list.get(i) + list.get(i+1);
                    ind[0] = i;
                    ind[1] = i+1;
                }
            }

            list.set(ind[0], sum);
            list.remove(ind[1]);
            n = list.size();
            ans++;
        }

        return ans;

    }


    private static boolean isSorted(ArrayList<Integer> list){
        int n = list.size();
        for (int i = 0 ; i < n-1 ; i++){
            if (list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
