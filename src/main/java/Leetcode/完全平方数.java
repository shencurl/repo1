package Leetcode;

import java.util.Arrays;

public class 完全平方数 {
    public int numSquares(int n) {
        //创建0-max_index的平方数数组
        int max_index=(int) Math.sqrt(n)+1;
        int[] iSquare=new int[max_index+1];
        for (int i=1;i<max_index;i++){
            iSquare[i]=i*i;
        }
        int[] dp=new int[n+1];
        //给dp[]赋值，dp[0]为0;
        Arrays.fill(dp,1,n+1,Integer.MAX_VALUE);
        //求1-n的dp[i]
        for (int i=1;i<=n;i++){
            for (int s=1;s<=max_index;s++){
                if (iSquare[s]>i)break;
                dp[i]=Math.min(dp[i],dp[i-iSquare[s]]+1);
            }
        }
        return dp[n];
    }
}
