package Leetcode;

public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int[] dp=new int[length];
        dp[0]=nums[0];
        int max=dp[0];
        for (int i=1;i<length;i++){
            dp[i]=nums[i]+dp[i-1]>nums[i]? nums[i]+dp[i-1]:nums[i];
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
