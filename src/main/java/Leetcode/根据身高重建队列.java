package Leetcode;

import java.util.*;

public class 根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //从高到低排序，如果等高按values升序
                return o1[0]==o2[0]? o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        List<int[]> result=new LinkedList<>();
        for (int[] p: people){
            //矮的人不会影响高的人前面有多少人的结果，所以先处理高的人，把高的人插入values对应的索引，有更矮的人出现，就往后挪。
            result.add(p[1],p);
        }
        int n=people.length;
        return result.toArray(new int[n][2]);
    }
}
