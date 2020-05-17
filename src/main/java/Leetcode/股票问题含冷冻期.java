package Leetcode;

public class 股票问题含冷冻期 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if (n<2) return 0;
        //0表示不持有股票，1表示持有,+w为卖，-为买,有冻结期如果当天持有，只能前天卖了股票，不能昨天买了今天又买
        int[][] dp=new int[n][2];
        for (int i=0;i<n;i++){
            if (i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            if (i==1){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
                dp[i][1]=Math.max(dp[i-1][0]-prices[i],dp[i-1][1]);
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
