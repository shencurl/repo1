package Leetcode;

public class 寻找重复数 {
    /**
     * 快慢指针，把nums看成链表，num的值就是next，因为 nums 中的每个数字都在 1 和 n 之间，所以它必须指向存在的索引
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int fast=nums[0];
        int slow=nums[0];
        do {
            fast=nums[nums[fast]];
            slow=nums[slow];
        }while (fast!=slow);
        int finder=nums[0];
        while (finder!=slow){
            finder=nums[finder];
            slow=nums[slow];
        }
        return finder;
    }
}
