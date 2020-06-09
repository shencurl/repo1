package Leetcode;

import java.time.temporal.Temporal;

public class 调整数组顺序使奇数位于偶数之前 {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1,tem;
        while (i<j){
            //要先判断i<j不然可能出现相等后越界
            while (i<j&&nums[i]%2==1)i++;
            while (i<j&&nums[j]%2==0)j--;
            tem=nums[i];
            nums[i++]=nums[j];
            nums[j--]=tem;
        }
        return nums;
    }

}
