package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class 数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i]))return nums[i];
            set.add(nums[i]);
        }
        return 0;
    }
}
