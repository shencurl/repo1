package Leetcode;

public class 把数字翻译成字符串 {
    public int translateNum(int num) {
        String s=String.valueOf(num);
        int a=1,b=1;
        for (int i=2;i<=s.length();i++){
            String tem=s.substring(i-2,i);
            //在10到25这个区间说明f(i)=f(i-1)+f(i-2),否则等于f(i-1);
            int c=tem.compareTo("10")>=0&&tem.compareTo("25")<=0? a+b:b;
            //a为f(i-2),b为f(i-1),c为f(i),滑动数组移动b，c
            a=b;
            b=c;
        }
        return b;
    }
}
