package Leetcode;

import java.util.Scanner;

public class MainBiTreeNums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(CatalanProcess(n));

    }
    //卡特兰数问题
    private static int CatalanProcess(int n) {
        if(n <= 1){
            return 1;
        }
        int[] h = new int[n+1];
        int result = 0;
        h[0] = h[1] = 1;
        for(int i=2 ; i<=n ; i++){
            h[i] = 0;
            for(int j=0 ; j<i ; j++){
                h[i] += (h[j]*h[i-(j+1)]);
            }
        }
        result = h[n];
        return result;
    }


//求二叉搜索树的
/*    public static int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;       //没有节点则为0，空树只有1个
        G[1] = 1;       //有1个节点，树只有1个

        for (int i = 2; i <= n; ++i) {        //要想得到以1-n的总二叉搜索树的总数量则需要把之前的也计算出来
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }*/
}