package Leetcode;

import java.util.HashSet;

public class 环形链表 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> set=new HashSet<>();
            while (head!=null){
                if (set.contains(head))return true;
                else set.add(head);
                head=head.next;
            }
            return false;
        }

        public ListNode detectCycle(ListNode head) {
            HashSet<ListNode> set=new HashSet<>();
            while (head!=null){
                if (set.contains(head))return head;
                else set.add(head);
                head=head.next;
            }
            return null;
        }
        }
    }

