package Leetcode;

public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //遍历二叉树A所有结点，只需返回一个节点就行，A,B不能为null。
        return (A!=null&&B!=null)&&(recursive(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }
    private boolean recursive(TreeNode A,TreeNode B){
      //说明b访问完了，及时A没访问玩也没事
      if (B==null) return true;
      //根不相等就没必要看后面的了
      if (A==null||A.val!=B.val)return false;
      //子树也要相等
      return recursive(A.left,B.left)&&recursive(A.right,B.right);
    }
}
