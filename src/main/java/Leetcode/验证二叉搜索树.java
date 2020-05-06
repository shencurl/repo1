package Leetcode;

public class 验证二叉搜索树 {
    //使用中序遍历，如果当前结点小于等于前面的节点，返回false；首先pre要long，不然当输入Integer.MIN_VALUE时会是false;
    private long pre= Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        //符合条件就继续往下走，不符合返回；
        if (root==null)return true;
        if (!isValidBST(root.left))return false;
        if (root.val<=pre)return false;
        pre=root.val;
        return isValidBST(root.right);
    }

        }


