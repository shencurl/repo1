package Leetcode;

import java.text.DateFormatSymbols;

public class 二叉树的最近公共祖先 {
    private TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return this.ans;
    }
    public boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if (root==null)return false;
        boolean flson=dfs(root.left,p,q);
        boolean frson=dfs(root.right,p,q);
        //要么左右子树都为true，要么root等于p.val||q.val并且左右子树有个为true;
        if (flson&&frson||((p.val==root.val||q.val==root.val)&&(flson||frson))) this.ans=root;
        //满足一下条件说明为true
        return flson||frson||(p.val==root.val||q.val==root.val);
    }
}
