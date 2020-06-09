package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class 二叉树中和为某一值的路径 {
    List<List<Integer>> result=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root,sum);
        return result;
    }
    private void recur(TreeNode root,int tar){
        if (root==null) return;
        path.add(root.val);
        tar-=root.val;
        //要copy一个对象，因为path对象是一个全局变量，会一直变
        if (tar==0&&root.left==null&&root.right==null)result.add(new LinkedList<>(path));
        recur(root.left,tar);
        recur(root.right,tar);
        //经典回溯移除最后访问的val。
        path.removeLast();
    }
}
