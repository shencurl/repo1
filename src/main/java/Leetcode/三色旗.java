package Leetcode;

import javafx.util.converter.NumberStringConverter;

public class 三色旗 {
    public void sortColors(int[] nums) {
        int p0=0,cur=0,p2=nums.length-1;
        while (cur<=p2){
            if (nums[cur]==0){
                swap(nums,cur,p0);
                p0++;
                cur++;
            }else if (nums[cur]==2){
                swap(nums,cur,p2);
                p2--;
                /*不能cur++；
                cur++;*/
            }else cur++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]= tem;
    }
}
