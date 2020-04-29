package Leetcode;

public class 二分查找旋转排序数组 {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        if (nums.length==0){
            return -1;
        }
        while (right>=left){
            int mid=(right+left)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>=nums[left]){
                //看是否在左边
                if (target>=nums[left]&&target<nums[mid]){
                    //在左边
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else{
                if (target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
