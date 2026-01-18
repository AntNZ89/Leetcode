package january.easy;

public class VowelConsonantScore {
    public int vowelConsonantScore(String s) {

        int c = 0;
        int v = 0;

        for (char ch : s.toCharArray()){
            if (isVow(ch)){
                v++;
            }
            else if (Character.isLetter(ch)){
                c++;
            }
        }

        return c == 0 ? 0 : v/c;

    }

    public boolean isVow(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
