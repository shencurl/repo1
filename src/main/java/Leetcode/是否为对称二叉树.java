package Leetcode;

public class 是否为对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        else return recur(root.left,root.right);
    }
    public boolean recur(TreeNode left,TreeNode right){
        if (left==null&&right==null) return true;
        if (left==null||right==null) return false;
        //对应岔开的树要对称
        if (left.val!=right.val) return false;
        return recur(left.left,right.right)&&recur(left.right,right.left);
    }
}