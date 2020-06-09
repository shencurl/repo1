package Leetcode;

public class 从头到尾打印链表 {
    int count=0;
    public int[] reversePrint(ListNode head) {
        ListNode reverse = reverse(head);
        int[] res=new int[count];
        for (int i=0;i<count;i++){
            res[i]=reverse.val;
            reverse=reverse.next;
        }
        return res;
    }
    private ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode tem=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tem;
            count++;
        }
        return pre;
    }
}
