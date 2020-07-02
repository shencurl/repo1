package Leetcode;

public class 序列化数字中的某一位 {
    /**
     * 每位的个数=位数*9*位
     * n-1表示当n能被digit整除时要退一位。
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        int digit=1;
        long count=9;
        long start=1;
        while (n>count){
            n-=count;
            start*=10;
            digit++;
            count=start*digit*9;
        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';

    }
}
