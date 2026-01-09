package january.easy;

import java.util.Stack;

public class FinalPrices {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = n-1 ; i >= 0 ; i--){

            boolean disc = false;
            int l = stack.size();

            for (int k = 0 ; k < l ; k++){
                if (prices[i] >= stack.peek()){
                    ans[i] = prices[i] - stack.peek();
                    disc = true;
                }
                else {
                    stack.pop();
                }
            }

            if (!disc){
                ans[i] = prices[i];
            }

            stack.push(prices[i]);

        }

        return ans;

    }
}
