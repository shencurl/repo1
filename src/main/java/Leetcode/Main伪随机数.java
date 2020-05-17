package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main伪随机数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        int k=0;
        while (true){
            x=(a*x+b)%m;
            if (!list.isEmpty()&&list.get(k).equals(x)){
                k++;
            }else {
                list.add(x);
            }
            if (k>2){
                break;
            }
        }
        System.out.println(list.size());
    }
}
