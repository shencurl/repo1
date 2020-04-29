package Leetcode;

import jdk.nashorn.internal.ir.WhileNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class 下一个排列 {
    public void nextPermutation(int[] nums) {
        int end=nums.length-1;
        int l=0,r=0;
        //找第一个拐点
        for (int i=end;i>0;i--){
            if (nums[i]>nums[i-1]){
                //l为拐点
                l=i;
                for (int j=end;j>=l;j--){
                    if(nums[j]>nums[l-1]){
                        r=j;
                        swap(nums,l-1,r);
                        return;
                    }
                }
            }
        }
        //求逆
        while (l<end){
            swap(nums,l,end);
            l++;
            end--;
        }

    }

    public void swap(int[] nums,int l,int r){
        int tem=nums[l];
        nums[l]=nums[r];
        nums[r]=tem;
    }



}
