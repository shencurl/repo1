package Leetcode;

import java.util.HashMap;

public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        ListNode cur=head;
        int i=0;
        while (cur!=null){
            map.put(++i,cur);
            cur=cur.next;
        }
        int res=map.size()-k+1;
        return map.get(res);
    }
    //快慢指针让快指针先走k步，后面慢指针再走
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode slow=head,fast=head;
        int t = 0;
        while(fast!=null){
            if(t>=k) slow=slow.next;
            fast = fast.next;
            t++;
        }
        return slow;
    }
}
