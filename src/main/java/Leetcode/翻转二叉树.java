package Leetcode;

public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        TreeNode temlift=invertTree(root.left);
        TreeNode temright=invertTree(root.right);
        root.left=temright;
        root.right=temlift;
        return root;
    }
}
