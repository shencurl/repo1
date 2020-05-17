package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 除自身以外数组的乘积 {
    /**
     * 用两个数组分别记录i元素左右两边的值，当i=0或i=n-1时，相应的L[i]，R[i]=1;
     * 数组ans代表结果，ans[i]=L[i]*R[i]
     * l[i]=nums[i-1]*L[i-1],R[i]=nums[i+1]*R[i+1]
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] L=new int[n];
        int[] R=new int[n];
        int[] ans=new int[n];
        L[0]=1;
        for (int i=1;i<n;i++){
            L[i]=L[i-1]*nums[i-1];
        }
        R[n-1]=1;
        for (int i=n-2;i>=0;i--){
            R[i]=nums[i+1]*R[i+1];
        }
        for (int i=0;i<n;i++){
            ans[i]=L[i]*R[i];
        }
        return ans;
    }
}
