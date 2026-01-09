package january.easy;

public class PivotInteger {
    public int pivotInteger(int n) {

        int[] ans = new int[n];
        ans[0] = 1;

        for (int i = 1 ; i < n ; i++){
            ans[i] = i+1 + ans[i-1];
        }

        int max = ans[n-1];

        if (n == 1){
            return 1;
        }

        for (int i = 1 ; i < n ; i++){
            if (ans[i] == (max-ans[i-1])){
                return i+1;
            }
        }

        return -1;

    }
}
