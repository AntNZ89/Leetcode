package febuary.easy;

public class BinaryGap {
    public int binaryGap(int n) {

        n >>= Integer.numberOfTrailingZeros(n);

        if (n == 1) return 0;

        int ans = 0;
        int c = 0;

        while (n > 0){
            if ((n & 1) == 1){
                ans = Math.max(ans, c);
                c = 0;
            }
            else {
                c++;
            }
            n >>= 1;
        }

        return ans + 1;

    }
}
