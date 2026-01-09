package january.medium;

import java.util.Arrays;

public class MaximumHappiness {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);
        long ans = 0;
        int n = happiness.length;
        int j = 0;

        for (int i = n-1 ; i >= 0 ; i--){
            if (happiness[i]-j <= 0){
                k--;
                j++;
                continue;
            }
            ans += (happiness[i] - j);
            j++;
            k--;
            if (k == 0) break;
        }

        return ans;

    }
}
