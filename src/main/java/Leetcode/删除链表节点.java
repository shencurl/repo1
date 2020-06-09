package Leetcode;

public class 删除链表节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;
        while (cur!=null){
            if (cur.next.val==val){
                cur.next=cur.next.next;
                return dummy.next;
            }
            cur=cur.next;
        }
        return null;
    }
}
