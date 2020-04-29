package Leetcode;

public class 排序第一和最后 {
    public int[] searchRange(int[] nums, int target) {
        int trangetRange[]={-1,-1};
        int start=0;
        int end=nums.length-1;
        int t=recure(nums,start,end,target);
        int left=t,right=t;
        if (t==-1){
            return trangetRange;
        }else {
            while(left>=start&&nums[t]==nums[left]){
                left--;
            }
            while(right<=end&&nums[t]==nums[right]){
                right++;
            }
            trangetRange[0]=left+1;
            trangetRange[1]=right-1;
            return trangetRange;

        }

    }
    public int recure(int[] n,int start, int end, int target){
        int mid=(end+start)/2;
        if (start>end){
            return -1;
        }
        if (n[mid]==target){
            return mid;
        }else if (n[mid]>target){
            return recure(n,start,mid-1,target);
        }else {
            return recure(n,mid+1,end,target);
        }
    }
}
