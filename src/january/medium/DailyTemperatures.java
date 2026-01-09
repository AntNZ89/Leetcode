package january.medium;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temps) {

        int n = temps.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n-1 ; i >= 0 ; i--){

            int l = stack.size();
            boolean warmer = false;

            for (int j = 0 ; j < l ; j++){
                if (temps[i] < temps[stack.peek()]){
                    ans[i] = stack.peek() - i;
                    warmer = true;
                    break;
                }
                else {
                    stack.pop();
                }
            }

            if (!warmer){
                ans[i] = 0;
            }

            stack.push(i);

        }

        return ans;

    }
}
