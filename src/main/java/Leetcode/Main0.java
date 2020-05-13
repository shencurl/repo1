package Leetcode;

import java.util.*;

public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] score = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                score[i][j] = sc.nextInt();
            }
        }
        System.out.println(findMax(new HashMap<Integer, Integer>(),score));
    }
    public static int findMax(HashMap<Integer,Integer> map,int[][] score){
        for (int j=0;j<score[0].length;j++){
            //记录最大值的纵坐标
            int temMax=0;
            for (int i=0;i<score.length;i++){
                if (score[i][j]>=score[temMax][j])
                    temMax=i;
            }
            map.put(temMax,1);
        }
        return map.size();
    }
}
