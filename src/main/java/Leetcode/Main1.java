package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int[] num=new int[n];
        int maxDis=-1;
        for (int i=0;i<n;i++){
            num[i]= scanner.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                int dis=hammingDistance(num[i],num[j]);
                if (dis>maxDis){
                    maxDis=dis;
                }
            }
        }
        System.out.println(maxDis);

    }

    public static int hammingDistance(int x,int y){
        int xor=x^y;
        int distance=0;
        while (xor!=0){
            distance+=1;
            xor=xor&(xor-1);
        }
        return distance;
                }
}
