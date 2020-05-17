package Leetcode;

public class 比特位计数 {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        for (int i=0;i<=num;i++){
            //>>1表示除以2，1<<表示除以2，i&1表示i%2
          /*  if ((i&1)==0)dp[i]=dp[i>>1];
            else dp[i]=dp[i-1]+1;*/
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;

    }
}
