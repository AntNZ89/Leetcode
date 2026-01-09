package january.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        int m = l.length;
        List<Boolean> ans = new ArrayList<>();

        for (int i = 0 ; i < m ; i++){

            int[] temp = new int[r[i]-l[i]+1];

            if (temp.length < 2){
                ans.add(false);
                continue;
            }
            if (temp.length == 2){
                ans.add(true);
                continue;
            }

            for (int left = l[i] ; left  <= r[i] ; left++){
                temp[left-l[i]] = nums[left];
            }

            Arrays.sort(temp);

            int dif = temp[0] - temp[1];

            boolean wtf = false;

            for (int k = 1 ; k < temp.length-1 ; k++){
                if (dif != temp[k] - temp[k+1]){
                    ans.add(false);
                    wtf = true;
                    break;
                }
            }

            if (!wtf) ans.add(true);

        }

        return ans;

    }
}
