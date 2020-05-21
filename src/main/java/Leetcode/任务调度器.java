package Leetcode;

import java.util.Arrays;

public class 任务调度器 {
    public int leastInterval(char[] tasks, int n) {
        //构造一个数组，用来存储个个字母的个数
        int[] map= new int[26];
        for (char c: tasks){
            map[c-'A']++;
        }
        Arrays.sort(map);
        int time=0;
        //当还有元素，每次按从大到小安排
        while (map[25]>0){
            //记录安排的位置，从末尾开始
            int i=0;
            //一个周期n+1
            while (i<=n){
                //每次循环要看最大值是不是为0了，为0说明后悔没有元素了可以不做了。
                if (map[25]==0)break;
                //要先看i，再看map，不然可能会越界
                if (i<26&&map[25 - i] > 0) map[25-i]--;
                i++;
                time++;
            }
            //每次循环后要进行重新排序，因为最大值可能会变
            Arrays.sort(map);
        }
        return time;
    }
}
