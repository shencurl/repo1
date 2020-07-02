package Leetcode;

public class 数组中出现次数超过一半的数 {
    /**
     * 摩尔投票法，x为假设的众数，如果vote==0则众数等于当前num
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int x=0,votes=0;
        for (int num:nums){
            if (votes==0)x=num;
            votes+=num==x? 1:-1;
        }
        return x;
    }
}
