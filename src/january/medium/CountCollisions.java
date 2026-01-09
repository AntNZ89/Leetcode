package january.medium;

public class CountCollisions {
    public int countCollisions(String directions) {

        int start = 0;
        int end = directions.length();

        for (int i = 0 ; i < directions.length() ; i++){
            if (directions.charAt(i) != 'L'){
                break;
            }
            start++;
        }

        for (int i = directions.length()-1 ; i >= start ; i--){
            if (directions.charAt(i) != 'R'){
                break;
            }
            end--;
        }

        int ans = 0;

        for (int i = start ; i < end ; i++){
            if (directions.charAt(i) != 'S'){
                ans++;
            }
        }

        return ans;

    }
}
