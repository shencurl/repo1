package Leetcode;

public class 移动零 {
    /**
     * index从0开始，把不为0的元素赋值到nums[index],然后index++;最后把index后面(包括index)的统一设为0。
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int index=0;
        for (int num:nums){
            if (num!=0){
                nums[index++]=num;
            }
        }
        while (index<nums.length){
            nums[index++]=0;
        }
    }
}
