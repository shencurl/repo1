package Leetcode;

import java.util.HashMap;

public class 前序中序确定二叉树 {
    int pre_inx=0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer,Integer> indexMap=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        this.inorder=inorder;
        int inx=0;
        //把中序数组中的val对应的index放到map，方便划分左右区间进行递归。
        for (int val:inorder){
            indexMap.put(val,inx++);
        }
        return recur(0,preorder.length-1);
    }
    public TreeNode recur(int left_index,int right_index){
        //当左边大于右边说明没有node
        if (left_index>right_index)return null;
        //取前序的当前结点
        int root_val=preorder[pre_inx];
        TreeNode root=new TreeNode(root_val);
        int index=indexMap.get(root_val);
        //这边可以不用for循环，直接pre++,一次递归就是一次++；
        pre_inx++;
        root.left=recur(left_index,index-1);
        root.right=recur(index+1,right_index);
        return root;

    }
}
