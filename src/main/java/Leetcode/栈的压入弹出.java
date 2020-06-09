package Leetcode;

import java.util.Stack;

public class 栈的压入弹出 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack=new Stack<>();
    int i=0;
    for (int num:pushed){
        stack.push(num);
        while (!stack.empty()&&stack.peek()==popped[i]){
            stack.pop();
            i++;
        }
    }
    return stack.isEmpty();
    }

}
