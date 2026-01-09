package january.medium;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {

        String conc = a;
        int ans = 1;

        while (conc.length() < b.length()){
            ans++;
            conc += a;
        }

        if (conc.contains(b)){
            return ans;
        }

        conc += a;
        ans++;

        if (conc.contains(b)){
            return ans;
        }

        return -1;

    }
}
