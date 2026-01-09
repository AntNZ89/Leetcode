package january.medium;

public class MaxProfit {
    public long maxProfit(int[] prices, int[] strategy, int k) {

        int n = prices.length;
        long[] profitSum = new long[n+1];
        long[] priceSum = new long[n+1];

        for (int i = 1 ; i  < n+1 ; i++){
            priceSum[i] = priceSum[i-1] + prices[i-1];
            profitSum[i] = profitSum[i-1] + (long)prices[i-1] * strategy[i-1];
        }

        long ans = profitSum[n];

        for (int i = k ; i < n+1 ; i++){
            long profitRight = profitSum[n] - profitSum[i];
            long profitLeft = profitSum[i - k ];
            long changeInProfit = priceSum[i] - priceSum[i - k/2];
            ans = Math.max(ans, profitRight + profitLeft + changeInProfit);
        }

        return ans;

    }
}
