package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        /*recur(root,result);
        return result;*/
        TreeNode cur=root;
        //用栈来模拟递归
        Stack<TreeNode> treeNodeStack=new Stack<>();
        //当cur和栈不为空，一直循环
        while (cur!=null||!treeNodeStack.empty()){
            while (cur!=null){
                treeNodeStack.push(cur);
                cur=cur.left;
            }
            //左边没有了就要出栈
            cur=treeNodeStack.pop();
            result.add(cur.val);
            cur=cur.right;
        }
        return result;
    }
    //递归
    public void recur(TreeNode root,List<Integer> list){
        if (root==null)return;
        recur(root.left,list);
        list.add(root.val);
        recur(root.right,list);
    }

}
