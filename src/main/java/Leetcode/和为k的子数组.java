package Leetcode;

public class 和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        //计算以start结尾的子数组的和等于k的有几个，并累加
        for (int start=0;start<nums.length;start++){
            int sum=0;
            for (int end=start;end>=0;end--){
                sum+=nums[end];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
