package january.easy;

public class CountTriples {
    public int countTriples(int n) {

        int ans = 0;

        for (int i = 1 ; i <= n ; i++){
            for (int j = i+1 ; j <= n ; j++){
                int val = i*i + j*j;
                int c = (int)Math.sqrt(val);
                if (c*c == val && c <= n){
                    ans += 2;
                }
            }
        }

        return ans;

    }
}
