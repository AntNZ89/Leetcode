package febuary.easy;

public class CountMonobit {
    public int countMonobit(int n) {
        int ans = 1;
        while (Math.pow(2, ans)-1 <= n){
            ans++;
        }
        return ans;
    }
}
