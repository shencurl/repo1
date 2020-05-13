package Leetcode;

public class test {
    public static void main(String[] args) {
        System.out.println(calc(101));
    }
    public static int calc(int a){
        int result=0,i=0,j=0;
        for (int k=a;k>0;k--){
            if (j>0)
                j=k*10+j;
            else j=k;
            while (j>=10){
                int t=j%100;
                j=j/100;
                result=((i++%2==0)? result-t:result+t);
            }
        }
        if (j>0)
            result=((i++%2==0)? result-j:result+j);
        return result;
    }
}
