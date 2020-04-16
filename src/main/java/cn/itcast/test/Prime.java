package cn.itcast.test;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=2;i<=number;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        boolean flag=true;
        for (int i=2;i<n;i++){

            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
