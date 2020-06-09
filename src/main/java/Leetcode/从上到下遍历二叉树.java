package Leetcode;

import jdk.nashorn.internal.ir.IfNode;

import java.util.*;

public class 从上到下遍历二叉树 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode outNode = queue.poll();
            arrayList.add(outNode.val);
            if (outNode.left != null) queue.add(outNode.left);
            if (outNode.right != null) queue.add(outNode.right);
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> tem=new LinkedList<>();
            for (int i= queue.size();i>0;i--){
                TreeNode node=queue.poll();
                //偶数对头插入
                if (res.size()%2==0)tem.addLast(node.val);
                else tem.addFirst(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tem);
        }
        return res;
    }
}
