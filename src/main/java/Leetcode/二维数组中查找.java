package Leetcode;

public class 二维数组中查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j=0;
        while (i>=0&&j<matrix[0].length){
            if (target>matrix[i][j])j++;
            else if (target<matrix[i][j])i--;
            else return true;
        }
        return false;
    }
}
