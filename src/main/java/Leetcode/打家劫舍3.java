package Leetcode;

public class 打家劫舍3 {
    public int rob(TreeNode root) {
        int[] result=recursive(root);
        return Math.max(result[0],result[1]);
    }
    public int[] recursive(TreeNode root){
        if ( root==null) return new int[2];
        int[] result=new int[2];
        int[] left=recursive(root.left);
        int[] right=recursive(root.right);
        result[0]=Math.max(left[1],left[0])+Math.max(right[1],right[0]);
        result[1]=left[0]+right[0]+root.val;
        return result;
    }
}
