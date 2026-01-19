package january.medium;

public class WaysToMakeFair {
    public int waysToMakeFair(int[] nums) {

        int n = nums.length;
        int sumEven = 0;
        int sumOdd = 0;
        int cumEven = 0;
        int cumOdd = 0;

        for (int i = 0 ; i < n ; i++){
            if (i % 2 == 0){
                sumEven += nums[i];
            }
            else {
                sumOdd += nums[i];
            }
        }

        int ans = 0;
        boolean isFair = false;

        for (int i = 0 ; i < n ; i++){
            if (i % 2 == 0){
                isFair = cumEven + sumOdd - cumOdd == cumOdd + sumEven - cumEven - nums[i];
                cumEven += nums[i];
            }
            else {
                isFair = cumEven + sumOdd - cumOdd  - nums[i] == cumOdd + sumEven - cumEven;
                cumOdd += nums[i];
            }

            if (isFair) ans++;

        }

        return ans;

    }
}
