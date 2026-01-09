package january.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSquares {
    public List<List<String>> wordSquares(String[] words) {

        List<List<String>> ans = new ArrayList<>();
        int n = words.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if (i == j) continue;
                for (int k = 0 ; k < n ; k++){
                    if (j == k || i == k) continue;
                    for (int x = 0 ; x < n ; x++){
                        if (k == x || j == x || i == k) continue;

                        char[] top = words[i].toCharArray();
                        char[] bottom = words[j].toCharArray();
                        char[] left = words[k].toCharArray();
                        char[] right = words[x].toCharArray();

                        if (top[0] != left[0] || top[3] != right[0] || bottom[0] != left[3] || bottom[3] != right[3]){
                            continue;
                        }

                        ans.add(Arrays.asList(new String(top), new String(left), new String(right), new String(bottom)));

                    }
                }
            }
        }

        ans.sort((a, b) -> a.toString().compareTo(b.toString()));

        return ans;

    }
}
