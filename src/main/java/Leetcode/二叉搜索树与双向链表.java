package Leetcode;

public class 二叉搜索树与双向链表 {
    TreeNode pre,head;
    public TreeNode treeToDoublyList(TreeNode root) {
        dfs(root);
        head.left=pre;
        pre.right=head;
        return head;
    }

    /**
     * 只能先处理左边的节点，因为左边访问过了，处理好后当当前结点变为pre后才能处理，之前节点的后续结点
     * @param cur
     */
    private void dfs(TreeNode cur){
        if (cur==null)return;
        dfs(cur.left);
        //pre为空时候
       if (pre!=null)pre.right=cur;
       else head=cur;
       cur.left=pre;
       pre=cur;
       dfs(cur.right);

    }
}
