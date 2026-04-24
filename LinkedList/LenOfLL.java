package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}


public class LenOfLL {
    public static int getLength(ListNode head) {
        if(head == null) return 0;
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        System.out.println(getLength(ll));
    }
}

