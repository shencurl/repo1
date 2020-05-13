package Leetcode;

public class 二叉树转化为链表 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode tem=root.right;
        root.right=root.left;
        root.left=null;
        //因为root=root.right中root形参指向了root.right，并没有改变真正root的值，只是把root.right对象赋值给了root这个形参
        while (root.right!=null)root=root.right;
        root.right=tem;
    }
}
