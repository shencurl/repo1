package Leetcode;

import java.util.Scanner;

public class MainStart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]sky=new int[n][2];
        for (int i=0;i<n;i++){
            sky[i][0]=sc.nextInt();
            sky[i][1]=sc.nextInt();
        }
        int res=0;
        for (int i=0;i<n;i++){
            int x=sky[i][0];
            int y=sky[i][1];
            boolean up=false;
            boolean down=false;
            boolean left=false;
            boolean right=false;
            for (int j=0;j<n;j++){
                if (i==j)continue;
                if (sky[j][0]==x){
                    if (sky[j][1]<y){
                        down=true;
                    }else {
                        up=true;
                    }
                }
                if (sky[j][1]==y){
                    if (sky[j][0]<x){
                        right=true;
                    }else {
                        left=true;
                    }
                }
            }
            if (up&&down&&left&&right){
                res++;
            }
        }
        System.out.println(res);
    }
}
