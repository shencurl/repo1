package Leetcode;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i:nums){
            //进行异或操作
            result^=i;
        }
        return result;
    }
}
