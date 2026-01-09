package january.easy;

public class CountOdds {
    public int countOdds(int low, int high) {

        int dif = high-low;
        int ans = 0;

        if (dif == 0 && low % 2 == 0) return 0;
        else if (dif == 0 && low % 2 != 0) return 1;

        if (low % 2 != 0 && high % 2 != 0){
            ans += (dif-1)/2 + 2;
        }
        else if (low % 2 == 0 && high % 2 == 0){
            ans += (dif+1)/2;
        }
        else {
            ans += dif/2 + 1;
        }

        return ans;

    }
}
