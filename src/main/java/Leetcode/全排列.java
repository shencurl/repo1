package Leetcode;

import java.util.*;

public class 全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int num : nums){
            output.add(num);
        }

        int n=nums.length;
        backTrack(n,output,result,0);
        return result;

    }
   public void backTrack(int n, List<Integer> outPut,List<List<Integer>> result,int first){
        if (first==n){
            //要加新的对象，不然只有一个
            result.add(new ArrayList<Integer>(outPut));
        }
        for (int i=first;i<n;i++){
            //把要交换的数换到first
            Collections.swap(outPut,first,i);
            //进行下一步
            backTrack(n,outPut,result,first+1);
            //交换回来让后面的i操作
            Collections.swap(outPut,first,i);
        }
   }
}
