package Leetcode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            double n=(double)scanner.nextInt();
            double total=n;
            int m=scanner.nextInt();
            for (int i=1;i<m;i++){
                total+=Math.pow(n,1/(Math.pow(2,i)));
            }
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.println(df.format(total));
        }
    }
}
