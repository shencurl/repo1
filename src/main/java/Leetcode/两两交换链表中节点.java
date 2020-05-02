package Leetcode;

public class 两两交换链表中节点 {
        public ListNode swapPairs(ListNode head) {
            //如果为空或者只有一个直接返回
            if (head==null||head.next==null){
                return head;
            }
            //需要交换的节点
            ListNode firstHead=head;
            ListNode secondHead=head.next;
            //交换
            firstHead.next=swapPairs(secondHead.next);
            secondHead.next=firstHead;
            //返回secondHead
            return secondHead;
        }
}
