package Leetcode;

public class 数值的整数次方 {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if (n==1)return x;
        if (n==-1)return 1/x;
        //看是奇数还是偶数，二分快速冥
        if (n%2==0){
            double t=myPow(x,n/2);
            return t*t;
        }else {
            double t=myPow(x,n/2);
            if (n<0)x=1/x;
            return t*t*x;
        }
    }
}
