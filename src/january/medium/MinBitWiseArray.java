package january.medium;

import java.util.List;

public class MinBitWiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0 ; i < n ; i++){
            int num = nums.get(i);
            String bin = toBinary(num);
            int pos = bin.length()-1;

            if (num == 2){
                ans[i] = -1;
                continue;
            }

            for (int j = 0 ; j < bin.length() ; j++){
                if (bin.charAt(j) == '0'){
                    pos = j-1;
                    break;
                }
            }

            ans[i] = change(num, pos);

        }

        return ans;

    }


    private static int change(int n, int pos){
        return n ^ (1 << pos);
    }

    private static String toBinary(int n){
        StringBuilder ans = new StringBuilder();
        while (n != 0){
            ans.append(n % 2);
            n = n / 2;
        }
        return ans.toString();
    }
}
