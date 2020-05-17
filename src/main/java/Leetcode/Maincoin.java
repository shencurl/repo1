package Leetcode;

import java.util.Scanner;

public class Maincoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            StringBuilder sb=new StringBuilder(str);
            int pointIndex=sb.indexOf(".");
            if (pointIndex==-1){
                sb.append(".00");
                int i=sb.indexOf(".");
                i=i-3;
                while (i-1>=0&&Character.isDigit(sb.charAt(i-1))){
                    sb.insert(i,",");
                    i-=3;
                }

            }
            else {
                int i=pointIndex;
                if (i+2<sb.length()-1){
                    sb.replace(i+3,sb.length(),"");
                }else {
                    while (i + 2 > sb.length() - 1) {
                        sb.append("0");
                    }
                }
                    i-=3;
                    while (i-1>=0&&Character.isDigit(sb.charAt(i-1))){
                        sb.insert(i,",");
                        i-=3;
                    }
                }

                if (sb.charAt(0)=='-'){
                    sb.replace(0,1,"$");
                    sb.insert(0,"(");
                    sb.append(")");
                }else {
                    sb.insert(0,"$");
                }
                System.out.println(sb.toString());

        }
    }
}
