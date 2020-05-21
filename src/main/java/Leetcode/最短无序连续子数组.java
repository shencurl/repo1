package Leetcode;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Stack;

public class 最短无序连续子数组 {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> findLR=new Stack<>();
        int l=0,r=nums.length-1;
        for (int i=0;i<nums.length;i++){
            while (!findLR.empty()&&nums[i]<findLR.peek()&&i<nums.length){
                findLR.pop();
            }
            findLR.push(nums[i]);

        }
        l=findLR.size();
        findLR.clear();
        for (int j=nums.length-1;j>=0;j--){
            if (j==nums.length-1)findLR.push(nums[j]);
            if (nums[j]>findLR.peek()){
                findLR.pop();
                if (findLR.empty()) break;
            }
        }
        r=findLR.size();
        return r+l>=nums.length-1?0:nums.length-l-r;
    }
}
