package Leetcode;

public class 路径总和3 {
    public int pathSum(TreeNode root, int sum) {
        if (root==null)return 0;
        //这个递归包含了所有路径，
        int result=countPath(root,sum);
        int l=pathSum(root.left,sum);
        int r=pathSum(root.right,sum);
        return result+l+r;

    }
    public int countPath(TreeNode root,int sum){
        if (root==null) return 0;
        sum-=root.val;
        int result=sum==0? 1:0;
        //计算以当前root为起点的路径有多少条,sum是减了以后的值，当sum为0后因为有负数，所以还可能有子路径，因为这是在一条路径上看有几个符合条件的子路径。
        return result+countPath(root.left,sum)+countPath(root.right,sum);
    }
}
