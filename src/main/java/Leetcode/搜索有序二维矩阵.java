package Leetcode;

public class 搜索有序二维矩阵 {
    /**
     * 从左下角开始,用双指针法，如果target>matrix[row][column],row--.如果target<matrix[row][column],column++.如果相等返回true。
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int column=0;
        while (row>=0&&column<matrix[0].length){
            if (target<matrix[row][column])row--;
            else if (target>matrix[row][column])column++;
            else return true;
        }
        return false;
    }
}
