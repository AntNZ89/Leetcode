package febuary.medium;

public class EqualSubstring {
    public int equalSubstring(String s, String t, int maxCost) {

        int n = s.length();
        int ans = 0;
        int sum = 0;
        int left = 0;
        int[] calc = new int[n];

        for (int  i = 0 ; i < n ; i++){
            calc[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        for (int i = 0 ; i < n ; i++){
            sum += calc[i];
            while (sum > maxCost){
                sum -= calc[left];
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }

        while (sum > maxCost){
            sum -= calc[left];
            left++;
        }

        ans = Math.max(ans, n-left);

        return ans;

    }
}
