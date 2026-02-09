package febuary.medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs){
            char[] tChar = s.toCharArray();
            Arrays.sort(tChar);
            String tString = new String(tChar);

            if (map.containsKey(tString)){
                ArrayList<String> temp = map.get(tString);
                temp.add(s);
                map.put(tString, temp);
            }
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(tString, temp);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (ArrayList<String> val : map.values()){
            ans.add(val);
        }

        return ans;

    }
}
