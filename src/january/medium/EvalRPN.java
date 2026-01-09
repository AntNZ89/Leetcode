package january.medium;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String op : tokens){

            char ch = op.charAt(0);

            if (op.length() == 1 && (ch == '+' || ch == '-' || ch == '*' || ch == '/')){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int res = 0;

                if (ch == '+'){
                    res = num1 + num2;
                }
                else if (ch == '-'){
                    res = num2 - num1;
                }
                else if (ch == '*'){
                    res = num1 * num2;
                }
                else if (ch == '/'){
                    res = num2 / num1;
                }

                stack.push(res);
                continue;
            }

            stack.push(Integer.parseInt(op));

        }

        return stack.pop();

    }
}
