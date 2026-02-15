package febuary.easy;

public class AddBinary {
    public String addBinary(String a, String b) {

        if (a.length() > b.length()){
            return helper(a.toCharArray(), b.toCharArray());
        }
        return helper(b.toCharArray(), a.toCharArray());

    }

    private String helper(char[] l, char[] s){
        StringBuilder ans = new StringBuilder();
        int dif = l.length - s.length;
        int carry = 0;
        for (int i = s.length- 1 ; i >= 0 ; i--){
            if (s[i] == '0' && l[i+dif] == '0'){
                if (carry > 0){
                    ans.append("1");
                    carry--;
                }
                else {
                    ans.append("0");
                }
            }
            else if (s[i] == '1' && l[i+dif] == '1'){
                if  (carry > 0){
                    ans.append("1");
                    carry--;
                }
                else {
                    ans.append("0");
                }
                carry++;
            }
            else {
                if (carry > 0){
                    ans.append("0");
                }
                else {
                    ans.append("1");
                }
            }
        }

        for (int i = dif-1 ; i >= 0 ; i--){
            if (l[i] == '0'){
                if (carry > 0){
                    ans.append("1");
                    carry--;
                }
                else {
                    ans.append("0");
                }
            }
            else {
                if (carry > 0){
                    ans.append("0");
                }
                else {
                    ans.append("1");
                }
            }
        }

        while (carry > 0){
            ans.append("1");
            carry--;
        }

        return ans.reverse().toString();

    }
}
