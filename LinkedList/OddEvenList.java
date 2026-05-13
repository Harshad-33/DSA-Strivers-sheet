package LinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenhead = even;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;

        }
        odd.next = evenhead;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode result = oddEvenList(head);

        while (result != null){
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.print("null");
    }
}


