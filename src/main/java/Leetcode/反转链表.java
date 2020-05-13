package Leetcode;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {
         ListNode pre=null;
         ListNode cur=head;
        while (cur!=null){
            ListNode temnext=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temnext;

        }
        return pre;

    }
}
