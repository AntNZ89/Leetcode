package january.medium;

public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {

        int ans = 0;

        for (int i = 0 ; i < strs.length-1 ; i++){
            for (int k = 0 ; k < strs[0].length() ; k++){
                if (strs[i].charAt(k) < strs[i+1].charAt(k)){
                    break;
                }
                else if (strs[i].charAt(k) > strs[i+1].charAt(k)){
                    for (int j = 0 ; j < strs.length ; j++){
                        StringBuilder build = new StringBuilder(strs[j]);
                        build.deleteCharAt(k);
                        strs[j] = build.toString();
                    }
                    i = 0;
                    k = -1;
                    ans++;
                }
                else {
                    continue;
                }
            }
        }

        return ans;

    }
}
