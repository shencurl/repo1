package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main最优 {
    private static int MIN=(int)1e6+10;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int min=MIN;
        int sum=0;
        ArrayList<Integer> Aprice=new ArrayList<>();
        ArrayList<Integer> Bprice=new ArrayList<>();
        for (int i=0;i<n;i++){
            int price=sc.nextInt();
            int kind=sc.nextInt();
            if (kind==1){
                Aprice.add(price);
                sum+=price;
            }else {
                min= Math.min(min,price);
                Bprice.add(price);
                sum+=price;
            }

        }

        Collections.sort(Aprice);
        int count=Aprice.size()-1;
        double res=0;
        while (k>0&&count>=0){
            if (k==1){
                res+=(double)Math.min(Aprice.get(0),min);
                break;
            }else {
                res+=(double) Aprice.get(count)/2;
                count--;
                k--;
            }
        }
        System.out.printf("%.2f",sum-res);

    }
}
