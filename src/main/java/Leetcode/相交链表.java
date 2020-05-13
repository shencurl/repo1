package Leetcode;

public class 相交链表 {
    //两个人分别走一段路，走完自己的后走对方的路，如果路有重合则返回第一个重合的点，两人走的路的总长度是一样的，A+B;
    //null和null不相等
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode pa=headA;
        ListNode pb=headB;
        while (pa!=pb){
            pa=pa.next;
            pb=pb.next;
            if (pa==null&&pb==null) return null;
            if (pa==null) pa=headB;
            if (pb==null) pb=headA;
        }
        return pa;
    }
}
