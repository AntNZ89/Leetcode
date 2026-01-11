package january.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDiagonalOrder2 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        HashMap<Integer, ArrayList<Integer>> sumToList = new HashMap<>();

        int n = nums.size();
        int maxSum = 0;
        int len = 0;

        for (int r = 0 ; r < n ; r++){
            int col = nums.get(r).size();
            len += col;
            for (int c = 0 ; c < col ; c++){
                if (sumToList.containsKey(r+c)){
                    ArrayList<Integer> temp = sumToList.get(r+c);
                    temp.add(nums.get(r).get(c));
                    sumToList.put(r+c, temp);
                }
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums.get(r).get(c));
                    sumToList.put(r+c, temp);
                }
                maxSum = Math.max(maxSum, r+c);
            }
        }

        int[] ans = new int[len];
        int index = 0;

        for (int i = 0 ; i <= maxSum ; i++){
            ArrayList<Integer> temp = sumToList.get(i);
            for (int j = temp.size()-1 ; j >= 0 ; j--){
                ans[index] = temp.get(j);
                index++;
            }
        }

        return ans;

    }
}
