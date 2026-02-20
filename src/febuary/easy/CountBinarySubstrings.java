package febuary.easy;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {

        int prev = 0;
        int curr = 1;
        int ans = 0;
        char[] arr = s.toCharArray();

        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] == arr[i-1]){
                curr++;
            }
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }

        return ans + Math.min(curr, prev);

    }
}
