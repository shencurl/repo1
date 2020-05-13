package Leetcode;

import java.util.Scanner;

public class MainZDNNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] s=scanner.nextLine().split(",");
        int start= Integer.parseInt(s[0]);
        int finish=Integer.parseInt(s[1]);
        int total=0;
        for (int i=start;i<=finish;i++){
            if (Integer.toBinaryString(i).length()-Integer.bitCount(i)>= Integer.bitCount(i))
                total+=1;
        }
        System.out.println(total);

    }
}
