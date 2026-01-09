package january.medium;

import java.util.ArrayList;
import java.util.List;

public class FourDivisors {
    public int sumFourDivisors(int[] nums) {

        int ans = 0;

        for (int num : nums){
            List<Integer> div = new ArrayList<>();
            for (int i = 1 ; i*i <= num ; i++){
                if (num % i == 0){
                    div.add(i);
                    if (i != num/i){
                        div.add(num/i);
                    }

                    if (div.size() > 4){
                        break;
                    }
                }
            }

            if (div.size() == 4 ){
                for (int i : div){
                    ans += i;
                }
            }
        }

        return ans;

    }
}
