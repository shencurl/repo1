package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的层次遍历 {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        recur(root,0);
        return result;
    }
    //需要一个level记录层数
    public void recur(TreeNode root,int level){
        if (root==null)return;
        //如果没有创建这一层的list则创建一个。
        if (result.size()==level)result.add(new ArrayList<Integer>());
        result.get(level).add(root.val);
        recur(root.left,level+1);
        recur(root.right,level+1);

    }

    public void recursive2(TreeNode root,int level){
        if (root==null) return;
        if (result.size()==level)result.add(new ArrayList<Integer>());
        result.get(level).add(root.val);
        recur(root.left,level+1);
        recur(root.right,level+1);

    }
}
