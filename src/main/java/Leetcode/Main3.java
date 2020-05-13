package Leetcode;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int[] res=new int[n];
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (isLike(num[i],num[j])){
                    res[i]=1;
                    res[j]=1;
                }
            }
            if (res[i]!=1){
                res[i]=-1;
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(res[i]+" ");
        }
    }
    public static boolean isLike(int i, int j){
        int a=i&j;
        if (a==0){
            return true;
        }else return false;
    }
}
