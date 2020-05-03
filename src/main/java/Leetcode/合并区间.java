package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1||intervals==null) return intervals;
        List<int[]> list=new ArrayList<>();
        //对二维数组进行排序，需要一个comparator
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i=0;i<intervals.length;i++){
            int left=intervals[i][0];
            int right=intervals[i][1];
            while (i<intervals.length-1&&intervals[i+1][0]<=right){
                right=Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[] {left,right});
        }
        //需要返回的数组要new一个
        return list.toArray(new int[list.size()][2]);

    }
}
