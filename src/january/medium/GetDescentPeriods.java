package january.medium;

public class GetDescentPeriods {
    public long getDescentPeriods(int[] prices) {

        long ans = 0;
        long count = 1;

        if (prices.length == 1) return 1;

        for (int i = 0 ; i < prices.length-1 ; i++){
            if (prices[i] == prices[i+1]+1){
                count++;
            }
            else {
                ans += gauss(count);
                count = 1;
            }
        }

        ans += gauss(count);

        return ans;

    }

    private static long gauss(long n){
        return (n*(n+1))/2;
    }

}
