package january.hard;

public class NumberOfWays {
    public int numberOfWays(String corridor) {

        int mod = (int)Math.pow(10, 9) + 7;
        long ans = 1;
        int temp = 0;
        int seats = 0;
        boolean toCountP = false;
        boolean contS = false;


        for (char ch : corridor.toCharArray()){
            if (ch == 'P' && toCountP){
                temp++;
            }

            if (ch == 'S'){
                seats++;
                toCountP = false;
                ans *= (temp+1);
                ans = ans % mod;
                temp = 0;
                contS = true;
            }

            if (seats == 2){
                seats = 0;
                toCountP = true;
            }
        }

        if (seats == 1 || !contS) return 0;
        return (int)ans;

    }
}
