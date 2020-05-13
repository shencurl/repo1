package Leetcode;

public class 最大正方形 {
    public int maximalSquare(char[][] matrix) {
        int maxSide=0;
        if (matrix.length==0||matrix==null||matrix[0].length==0)return 0;
        int row=matrix.length,column=matrix[0].length;
        int[][] dp=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (matrix[i][j]=='1') {
                    if (i==0||j==0){
                        dp[i][j]=1;
                    }else {
                        //动归方程
                        dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }
                }
                maxSide=Math.max(dp[i][j],maxSide);
            }
        }
        int maxSquare=maxSide*maxSide;
        return maxSquare;
    }
}
