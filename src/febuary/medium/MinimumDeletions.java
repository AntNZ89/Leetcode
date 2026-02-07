package febuary.medium;

public class MinimumDeletions {
    public int minimumDeletions(String s) {

        int n = s.length();
        int[] pref = new int[n+1];
        int[] suff = new int[n+1];

        if (n == 1) return 0;

        for (int i = 0 ; i < n ; i++){
            int add = s.charAt(i) == 'a' ? 1 : 0;
            pref[i+1] = pref[i] + add;
        }

        for (int i = n-1 ; i >= 0 ; i--){
            int add = s.charAt(i) == 'b' ? 1 : 0;
            suff[i] = suff[i+1] + add;
        }

        int ans = 0;

        for (int i = 0 ; i < n ; i++){
            ans = Math.max(ans, suff[i]+pref[i+1]);
        }

        return n - ans;

    }
}
