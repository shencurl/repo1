package Leetcode;

public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int pre= nums[0];
        for (int i=1;i<nums.length;i++){
            //计算下标为i时候的最大值
            pre=Math.max(pre+nums[i],nums[i]);
            //比较原来的和最新的最大值
            max=Math.max(max,pre);
        }
        return max;
    }
}
