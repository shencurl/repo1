package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 先序中序确定二叉树2刷 {
    int pre_index=0;
    int[] preorder;
    int[] inorder;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        this.inorder=inorder;

        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int left=0,right=preorder.length-1;
        return recur(left,right);
    }

    private TreeNode recur(int left,int right) {
        if (left>right)return null;
        int root_val=preorder[pre_index];
        TreeNode root=new TreeNode(root_val);
        int mid=map.get(root_val);
        pre_index++;
        root.left=recur(left,mid-1);
        root.right=recur(mid+1,right);
        return root;
    }
}
