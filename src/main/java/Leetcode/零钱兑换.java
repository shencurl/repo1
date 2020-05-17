package Leetcode;

import java.util.Arrays;

/**
 * 回溯会超时
 */
public class 零钱兑换 {
     private int max=Integer.MAX_VALUE;
    public int coinChange1(int[] coins, int amount) {
        Arrays.sort(coins);
        backTrace(coins,amount,0,0);
        return max==Integer.MAX_VALUE? -1:max;
    }
    public void backTrace(int[] coins,int residue,int start,int path){
        if (residue==0)max=Math.min(max,path);
        for (int i=start;i<coins.length;i++){
            if (residue<coins[i]) break;
            path++;
            backTrace(coins,residue-coins[i],i,path);
            path--;
        }
    }
    public int coinChange(int[] coins, int amount) {
        if (amount==0||coins.length==0||coins==null)return 0;
        int[] dp=new int[amount+1];
        //初始值设为amount+1，如果没有存在的数，那么最后是amount+1
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if (coins[j]<=i){
                    //状态转移方程，自下而上，dp[i]为最小值，dp[i-coins[j]]+1表示加上这个硬币的量
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount? -1:dp[amount];
    }
}
