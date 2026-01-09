package january.medium;

public class CountPermutations {
    public int countPermutations(int[] complexity) {

        int mod = (int)Math.pow(10, 9) + 7;
        int n = complexity.length;
        int min = complexity[0];
        boolean swapped = false;

        for (int i = 1 ; i < n ; i++){
            if (min >= complexity[i]){
                swapped = true;
            }
        }

        if (swapped){
            return 0;
        }

        int dif = n-2;
        long ans = n-1;

        for (int i = 2 ; i < n ; i++){
            ans = (ans * dif) %  mod;
            dif--;
        }

        return (int)ans;

    }
}
