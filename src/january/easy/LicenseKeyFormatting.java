package january.easy;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder ans = new StringBuilder();
        int c = 0;

        for (int i = s.length()-1 ; i >= 0 ; i--){
            if (s.charAt(i) == '-'){
                continue;
            }

            if (c == k){
                c = 0;
                ans.append("-");
            }

            ans.append(Character.toUpperCase(s.charAt(i)));
            c++;
        }

        return ans.reverse().toString();

    }
}
