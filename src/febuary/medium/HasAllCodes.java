package febuary.medium;

import java.util.HashSet;
import java.util.Set;

public class HasAllCodes {
    public boolean hasAllCodes(String s, int k) {

        int l = 0;
        int r = k;
        int goal = (int)Math.pow(2, k);
        Set<String> seen = new HashSet<>();

        while (r <= s.length()){
            seen.add(s.substring(l, r));
            l++;
            r++;
            if (seen.size() == goal) return true;
        }

        return seen.size() == goal ? true : false;

    }
}
