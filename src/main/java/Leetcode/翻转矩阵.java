package Leetcode;

public class 翻转矩阵 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //先倒置矩阵,j不是0开始，0开始等于换了两遍
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
        //再行翻转

      for (int k=0;k<n;k++){
            int l=0,r=n-1;
            while (l<r){
                int tem=matrix[k][l];
                matrix[k][l]=matrix[k][r];
                matrix[k][r]=tem;
                l++;
                r--;
            }
        }

    }
}
