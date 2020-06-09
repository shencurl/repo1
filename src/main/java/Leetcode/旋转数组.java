package Leetcode;

public class 旋转数组 {
    public int minArray(int[] numbers) {
        int i=0,j=numbers.length-1;
        //不断缩进找到i
        while (i<j){
            int m=(i+j)/2;
            if (numbers[m]<numbers[j])j=m;
            else if (numbers[m]==numbers[j])j--;
            else i=m+1;
        }
        return numbers[i];
    }
}
