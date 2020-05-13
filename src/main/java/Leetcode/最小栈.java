package Leetcode;

import java.util.Stack;

public class 最小栈 {
    private Stack<Integer> data;
    private Stack<Integer> min;
    public 最小栈() {
        this.data=new Stack<>();
        this.min=new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (min.empty()||min.peek()>=x) min.push(x);
        else min.push(min.peek());

    }

    public void pop() {
        if (!data.empty()) {
            data.pop();
            min.pop();
        }

    }

    public int top() {
        if (!data.empty()) {
            return data.peek();
        }
        throw new RuntimeException("栈元素为空，此操作非法");
    }

    public int getMin() {
        if (!min.empty()) {
            return min.peek();
        }
        throw new RuntimeException("栈元素为空，此操作非法");
    }
}
