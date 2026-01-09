package january.hard;

import java.util.Stack;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int n = heights.length;
        int ans = 0;

        for (int i = 0 ; i < n ; i++){
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = i - stack.peek() - 1;
                ans = Math.max(ans, h*w);
            }
            stack.push(i);
        }

        while (stack.peek() != -1){
            int h = heights[stack.pop()];
            int w = n - stack.peek() - 1;
            ans = Math.max(ans, h*w);
        }

        return ans;

    }
}
