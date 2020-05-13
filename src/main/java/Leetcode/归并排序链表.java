package Leetcode;

public class 归并排序链表 {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        //找到中点
        ListNode midle=mid(head);
        //左右子链表,右链表等于midle.next,左链表等于把midle.next断掉;
        ListNode righthead=midle.next;
        midle.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(righthead);
        //合并左右排好序的
        return merge(left,right);

    }
    //快慢指针找中点
    private ListNode mid(ListNode head){
        if (head==null||head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next.next;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //合并两个有序链表
    private ListNode merge(ListNode left,ListNode right){
        //一个头结点，一个当前结点
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while (left!=null&&right!=null){
            if (left.val<right.val){
                curr.next=left;
                left=left.next;
            }else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;
        }
        curr.next=left==null? right:left;
        return dummy.next;
    }
}
