package linked_list_cycle;

import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {

    public static void main(String[] args) {

        ListNode list = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        list.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(hasCycle(list));
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode traversalNode = head;
        HashMap<ListNode, ListNode> map = new HashMap<>();
        while (traversalNode != null){
            if (map.containsValue(traversalNode.next)) return true;
            else {
                if(traversalNode.next == null) return false;
                map.put(traversalNode, traversalNode.next);
            }
            traversalNode = traversalNode.next;
        }
        return false;
    }
}
