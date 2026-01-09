package january.easy;

public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {

        int up = 0;
        int low = 0;

        for (int i = 0 ; i < word.length() ; i++) {
            if (word.charAt(i) < 97){
                up++;
            }
            else {
                low++;
            }

            if (up == 1){
                continue;
            }
            else if (up != 0 && low != 0){
                return false;
            }
        }

        if (up == 1 && word.charAt(0) > 96){
            return false;
        }

        return true;

    }
}
