package Leetcode;

import java.util.Stack;

public class 字符串解码 {
    public String decodeString(String s) {
        //用于储存临时的res
        StringBuilder sb=new StringBuilder();
        int multi=0;
        //因为有可能有括号嵌套括号的情况，所以要用到栈
        Stack<String> Stack_res=new Stack<>();
        Stack<Integer> Stack_multi=new Stack<>();
        for (char c:s.toCharArray()){
            //如果是数字
            if (c>='0'&&c<='9'){
                multi=multi*10+Integer.parseInt(c+"");
            }else if (c=='['){
                //把'["前面最近的数字加入到栈
                Stack_multi.add(multi);
                multi=0;
                //把前面处理好的res加入栈，并吧sb设为0处理‘[’里边的字符
                Stack_res.add(sb.toString());
                sb.setLength(0);
            }else if (c==']'){
                //遇到‘]’则可以处理栈顶的res了，数字出栈，上一个的[]里边的结果出栈，并把当前[]里边的加入到上一个里边去，最后sb=tem，也就是处理后的结果。
                int curmulti=Stack_multi.pop();
                StringBuilder tem=new StringBuilder(Stack_res.pop());
                for (int i=0;i<curmulti;i++){
                    tem.append(sb);
                }
                sb=tem;
            }else sb.append(c);
        }
        return sb.toString();
    }
}
