package january.medium;

public class MaskPII {
    public String maskPII(String s) {

        boolean isNum = false;

        for (char ch : s.toCharArray()){
            if (Character.isLetter(ch)){
                isNum = false;
                break;
            }

            if (Character.isDigit(ch)){
                isNum = true;
                break;
            }
        }

        if (isNum){
            int c = 0;

            for (char ch : s.toCharArray()){
                if (Character.isDigit(ch)) c++;
            }

            StringBuilder ans = new StringBuilder();

            for (int i = s.length()-1 ; i >= 0 ; i--){
                if (Character.isDigit(s.charAt(i))){
                    ans.append("" + s.charAt(i));
                }

                if (ans.length() == 4){
                    break;
                }
            }

            if (c == 10){
                return "***-***-" + ans.reverse().toString();
            }
            else if (c == 11){
                return "+*-***-***-" + ans.reverse().toString();
            }
            else if (c == 12){
                return "+**-***-***-" + ans.reverse().toString();
            }
            else if (c == 13){
                return "+***-***-***-" + ans.reverse().toString();
            }
        }

        int i = s.indexOf('@');
        StringBuilder ret = new StringBuilder();

        if (i == 1){
            ret.append("" + s.charAt(0));
        }
        else if (i >= 2){
            ret.append("" + Character.toLowerCase(s.charAt(0)));
            ret.append("*****");
            ret.append("" + Character.toLowerCase(s.charAt(i-1)));
        }

        for (int j = i ; j < s.length() ; j++){
            ret.append("" + Character.toLowerCase(s.charAt(j)));
        }

        return ret.toString();

    }
}
