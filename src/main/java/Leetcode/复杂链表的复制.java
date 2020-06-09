package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 复杂链表的复制 {
    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node newhead=new Node(head.val);
        Node tem=newhead;
        //久节点和新节点一一对应
        Map<Node,Node> map=new HashMap<>();
        while (head!=null){
            map.put(head,tem);
            head=head.next;
            if (head!=null)tem.next=new Node(head.val);
            tem=tem.next;
        }
        for (Node key: map.keySet()){
            //把head对应的random节点的tem节点复制给，tem
            map.get(key).random=map.get(key.random);
        }
        return newhead;
    }
}
