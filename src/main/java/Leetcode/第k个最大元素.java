package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class 第k个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
