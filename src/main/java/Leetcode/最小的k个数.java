package Leetcode;

import java.util.Arrays;

public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k==0)return new int[0];
        quickSelect(k,0,arr.length-1,arr);
        int[] result= Arrays.copyOf(arr,k);
        return result;
    }
    private int quickSort(int start,int end, int[] arr){
        int tem=arr[start];
        int left=start;
        int right=end;
        if (left>=right)return left;
        while (left<right){
            while (left<right&&arr[right]>tem)right--;
            if (left<right)arr[left++]=arr[right];
            while (left<right&&arr[left]<tem)left++;
            if (left<right)arr[right--]=arr[left];
        }
        arr[left]=tem;
        return left;
    }
    private void quickSelect(int k,int start,int end,int[] arr){
        if (start>end)return;
        int m=quickSort(start,end,arr);
        //刚好前k个数就是要求的
        if (m==k-1) return;
        //前k个数在m左边
        else if (m>k-1)quickSelect(k,start,m-1,arr);
        //注意这边不是k-m，因为我们要找到是坐标，所以要在m+1到end再快排使m==k-1
        else quickSelect(k,m+1,end,arr);
    }

    public static void main(String[] args) {
        最小的k个数 test= new 最小的k个数();
        int[] arr={0,0,1,2,4,2,2,3,1,4};
        int[] result=test.getLeastNumbers(arr,8);
    }
}
