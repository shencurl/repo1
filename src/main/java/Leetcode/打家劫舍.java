package Leetcode;

public class 打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        else if (nums.length==1) return nums[0];
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            //状态转移方程，ans[i]表示前i个房子的最大值
            ans[i]=Math.max(ans[i-1],nums[i]+ans[i-2]);
        }
        return ans[nums.length-1];
    }
}
