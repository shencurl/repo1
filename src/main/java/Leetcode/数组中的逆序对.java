package Leetcode;

public class 数组中的逆序对 {
    public int reversePairs(int[] nums) {
        int[] tem=new int[nums.length];
        return sort(nums,0,nums.length-1,tem);
    }
    public int sort(int[] a,int low,int hight,int[] tem){
        int mid=low+(hight-low)/2;
        if (low<hight) {
            int leftreversePairs=sort(a,low,mid,tem);
            int rightreversePairs=sort(a,mid+1,hight,tem);
            //优化，说明有序了
            if (a[mid]<=a[mid+1])return leftreversePairs+rightreversePairs;
            int crossPairs= merge(a,low,mid,hight,tem);
            return leftreversePairs+rightreversePairs+crossPairs;
        }
        return 0;
    }
    private int merge(int[] a,int left,int mid,int right,int[] tem){
        //需要一个临时数组保存数据
        //三个指针，不能直接left，mid，right操作，因为后面还要用。
        int i=left;
        int j=mid+1;
        int k=left;
        //记录每次merge产生的逆序对
        int count=0;
        while (i<=mid&&j<=right){
            if (a[i]<=a[j]){
                tem[k++]=a[i++];
            }
            else {
                //如果a[i]>a[j],则i到mid都大于a[j]，这样就能得到全部结果。
                count+=(mid-i+1);
                tem[k++]=a[j++];
            }
        }
        while (i<=mid){
            tem[k++]=a[i++];
        }
        while (j<=right){
            tem[k++]=a[j++];
        }
        for (int s=left;s<=right;s++){
            //a不是从0开始的，而是left开始
            a[s]=tem[s];
        }
        return count;
    }

    public static void main(String[] args) {
        数组中的逆序对 test=new 数组中的逆序对();
        int[] test1={1,3,2,3,1};
        int res=test.reversePairs(test1);
        System.out.println(res);
    }
}
