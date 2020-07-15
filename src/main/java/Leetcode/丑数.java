package Leetcode;

public class 丑数 {
    public int nthUglyNumber(int n) {
        //方便操作多设置了一个数
        int[] dp=new int[n+1];
        dp[1]=1;
        int a=1,b=1,c=1;
        for (int i=2;i<=n;i++){
            //三个指针分别指向a、b、c，a负责走*2这条线路，b负责3，c负责5，快了就等后面的，让最小值的先走，不断往前走，dp[i]等于最小值
            int n2=dp[a]*2,n3=dp[b]*3,n5=dp[c]*5;
            dp[i]=Math.min(n2,Math.min(n3,n5));
            if (dp[i]==n2)a++;
            if (dp[i]==n3)b++;
            if (dp[i]==n5)c++;
        }
        return dp[n];
    }
}
