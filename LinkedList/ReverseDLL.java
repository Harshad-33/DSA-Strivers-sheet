package LinkedList;

class ListNode{
    int data;
    ListNode prev;
    ListNode next;
    ListNode(){}
    ListNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    ListNode(int data , ListNode prev , ListNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}


public class ReverseDLL {
    public static ListNode ReverseDLL(ListNode head){
        if(head == null) return null;
        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.prev = head;
        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(4);
        head.next.next.next.prev = head.next.next;

        head = ReverseDLL(head);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


