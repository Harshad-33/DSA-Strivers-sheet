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

public class DeleteHeadDLL {
    public static ListNode deleteHead(ListNode head) {
        if(head == null) return null;

        ListNode newhead = head.next;
        if(newhead == null) {
            return null;
        }

        newhead.prev = null;
        return newhead;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.prev = head;
        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;

        head = deleteHead(head);

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}


