package Leetcode;

public class 二叉搜索树变为累加树 {
    //创建一个公共变量，相当于二叉搜索树从大到小累加的结果
    int sharesum=0;
    public TreeNode convertBST(TreeNode root) {
        recursive(root);
        return root;
    }
    private void recursive(TreeNode root){
        if (root==null) return;
        recursive(root.right);
        //每次遍历到了某个点就把之前的和加上，一开始sharesum为0；
        root.val+=sharesum;
        sharesum=root.val;
        recursive(root.left);
    }

}
