package january.easy;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> q;

    public MyQueue() {
        q = new Stack<Integer>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        temp.addAll(q);
        q.clear();
        q.push(x);
        q.addAll(temp);
    }

    public int pop() {
        return q.pop();
    }

    public int peek() {
        return q.peek();
    }

    public boolean empty() {
        return q.empty();
    }
}