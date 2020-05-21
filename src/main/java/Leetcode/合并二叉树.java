package Leetcode;

public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //如果其中一个为null返回另一个
        if (t1==null) return t2;
        if (t2==null) return t1;
        //先序遍历
        t1.val+=t2.val;
        t1.left=mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t2.right,t1.right);
        return t1;
    }
}
