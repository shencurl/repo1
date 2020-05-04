package Leetcode;

public class 快速排序 {
    public void quickSort(int[] a,int left,int right){

        int i=left;
        int j=right;
        if (left>=right) return;
        int temp=a[left];
        while (i<j){
            while (i<j&&a[j]>=temp)j--;
            if (i<j)a[i]=a[j];
            while (i<j&&a[i]<=temp)i++;
            if (i<j)a[j]=a[i];
        }
        a[i]=temp;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
    }
}
