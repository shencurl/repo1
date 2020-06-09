package Leetcode;

import javax.xml.transform.Result;
import java.util.Stack;

public class 每日温度 {
    public int[] dailyTemperatures(int[] T) {
        int[] reuslt=new int[T.length];
        Stack<Integer> stack=new Stack<>();
        for (int i=T.length-1;i>=0;i--){
            //栈按从大到小放置，如果要入栈元素大于等于栈顶，说明栈顶不符合要求，要出栈，
            while (!stack.empty()&&T[i]>=T[stack.peek()]) stack.pop();
            //入栈元素减去栈顶元素的值即相差的天数,栈为空说明前面没有更大的
            reuslt[i]=stack.empty()? 0:stack.peek()-i;
            //每次要入栈i，这样后面元素才能进行判断
            stack.push(i);
        }
        return reuslt;
    }
}
