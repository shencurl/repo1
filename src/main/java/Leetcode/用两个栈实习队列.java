package Leetcode;

import java.util.Stack;

public class 用两个栈实习队列 {
    Stack<Integer> stack_1=new Stack<>();
    Stack<Integer> stack_2=new Stack<>();
    public 用两个栈实习队列() {
        stack_1=new Stack<>();
        stack_2=new Stack<>();
    }

    public void appendTail(int value) {
        stack_1.push(value);
    }

    public int deleteHead() {
        //stack1负责进，stack_2负责出，当stack_2不为空时直接出，当stack2为空stack1不为空时从stack取出所有将要出栈的元素。
        if (!stack_2.empty()) return stack_2.pop();
        else if (stack_1.empty()&&stack_2.empty())return -1;
        else {
            while (!stack_1.empty()){
                stack_2.push(stack_1.pop());
            }
            return stack_2.pop();
        }
    }
}
