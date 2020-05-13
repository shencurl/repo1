package Leetcode;

import java.util.List;

public class 回文链表 {
    public static boolean isPalindrome(ListNode head) {
        ListNode palindrome=reverse(head);
        ListNode curr=head;
        while (curr!=null){
            if (curr.val!=palindrome.val) return false;
            curr=curr.next;
            palindrome=palindrome.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode temCur=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temCur;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        ListNode r2=new ListNode(1);
        root.next=r2;
        ListNode r3=new ListNode(2);
        r2.next=r3;
        ListNode r4=new ListNode(1);
        r3.next=r4;
        boolean tf=isPalindrome(root);
        System.out.println(isPalindrome(root));

    }
}



