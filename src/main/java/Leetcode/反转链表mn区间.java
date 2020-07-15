package Leetcode;

public class 反转链表mn区间 {
    //找到m的位置，同时反转m-n次
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        while (m>1){
            pre=pre.next;
            m--;
            n--;
        }
        head=pre.next;
        while (n>1){
            ListNode headnext=head.next;
            //这边head是不变的，只是next后移一位
            head.next=head.next.next;
            //headnext节点要移动到反转链表的首部
            headnext.next=pre.next;
            //将headnext指定为首部节点
            pre.next=headnext;
            n--;
        }
        return dummy.next;
    }
}
