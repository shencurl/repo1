package Leetcode;

public class 二叉搜索数的后序遍历结果是否正确 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(0,postorder.length-1,postorder);
    }
    private boolean recur(int start,int end,int[] postorder){
        //为空或者一个节点
        if (start>=end)return true;
        int p=start;
        //左子树小于根
        while (postorder[p]<postorder[end])p++;
        //右子树第一个元素
        int mid=p;
        //右子树大于根
        while (postorder[p]>postorder[end])p++;
        //一趟遍历下来p到了end说明左右子树都符合定义，递归判断左右子树
        return p==end&&recur(start,mid-1,postorder)&&recur(mid,end-1,postorder);
    }
}
