package Leetcode;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.logging.Level;

public class 归并排序 {
    public int[] sort(int[] a,int low,int hight){
        int mid=low+hight/2;
        if (low<hight) {
            sort(a,low,mid);
            sort(a,mid+1,hight);
            merge(a,low,mid,hight);
        }
        return a;
    }
    private void merge(int[] a,int left,int mid,int right){
        //需要一个临时数组保存数据
        int[] tem=new int[right-left+1];
        //三个指针，不能直接left，mid，right操作，因为后面还要用。
        int i=left;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=right){
            if (a[i]<a[j])tem[k++]=a[i++];
            else tem[k++]=a[j++];
        }
        while (i<=mid){
            tem[k++]=a[i++];
        }
        while (j<=right){
            tem[k++]=a[j++];
        }
        for (int s=0;s<tem.length;i++){
            //a不是从0开始的，而是left开始
            a[s+left]=tem[s];
        }
    }
}
