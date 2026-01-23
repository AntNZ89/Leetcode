package january.medium;

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int[] pref = new int[n+1];
        pref[0] = 1;
        for (int i = 0 ; i < n ; i++){
            pref[i+1] = pref[i] * nums[i];
        }

        int[] suff = new int[n+1];
        suff[n] = 1;
        for (int i = n ; i > 0 ; i--){
            suff[i-1] = suff[i] * nums[i-1];
        }

        for (int i = 0 ; i < n ; i++){
            ans[i] = pref[i] * suff[i+1];
        }

        return ans;

    }
}
