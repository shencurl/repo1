package Leetcode;

import java.util.Stack;

public class 包含min函数的栈 {
    //A存储所有元素，实现普通栈，B实现返回最小值，因此B要按降序插入，即比栈顶大的元素不插入
    Stack<Integer> AStack;
    Stack<Integer> BStack;
    public 包含min函数的栈() {
        this.AStack=new Stack<>();
        this.BStack=new Stack<>();
    }

    public void push(int x) {
        AStack.push(x);
        if (BStack.empty()|| BStack.peek()>=x)BStack.push(x);
    }

    public void pop() {
        //这边用==会返回错误，因为因为A,B返回的都是对象肯定不相等的，
        if (AStack.pop().equals(BStack.peek()))BStack.pop();
    }

    public int top() {
        return AStack.peek();
    }

    public int min() {
        return BStack.peek();
    }
}
