package febuary.medium;

import java.util.HashMap;

public class PrefixConnected {
    public int prefixConnected(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : words){
            if (s.length() < k) continue;

            StringBuilder pref = new StringBuilder();

            for (int i = 0 ; i < k ; i++){
                pref.append(s.charAt(i));
            }

            String key = pref.toString();

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int ans = 0;

        for (int val : map.values()){
            ans += val > 1 ? 1 : 0;
        }

        return ans;

    }
}
