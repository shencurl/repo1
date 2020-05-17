package Leetcode;

import java.util.Arrays;

public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if (n==0||nums==null) return 0;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int max=1;
        //动态规划，都是要前面[0-i]的状态中的一个取得最值
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max= Math.max(max,dp[i]);
        }
        return max;
    }
}
