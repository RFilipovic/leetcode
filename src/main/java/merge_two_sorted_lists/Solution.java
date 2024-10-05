package merge_two_sorted_lists;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Solution {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode list = mergeTwoLists(node1, node4);
        ListNode node = list;

        System.out.print("[ ");
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println("]");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode();
        ListNode current = node;

        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

       if (list1 == null){
           current.next = list2;
       }else if (list2 == null){
           current.next = list1;
       }

       return node.next;
    }

}
