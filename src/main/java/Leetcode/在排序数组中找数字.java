package Leetcode;

public class 在排序数组中找数字 {
    public static int  search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int mt=-1;
        while (i<=j){
            int m=(i+j)/2;
            if (nums[m]==target){
                mt=m;
                break;
            } else if (nums[m]>target)j=m-1;
            else i=m+1;
        }
        if (mt==-1)return 0;
        if (mt==0)return 0;
        int l=mt,r=mt;
        while (l>=0&&nums[l]==target)l--;
        while (r<=nums.length-1&&nums[r]==target)r++;
        return r-l-1;
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int t=search(nums,8);
        System.out.println(t);
    }
}
