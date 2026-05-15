package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
        val = 0;
        next = null;
    }
    ListNode(int data1) {
        val = data1;
        next = null;
    }
    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}


public class DeleteMiddleN {
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        int leng = 0;

        while(temp != null){
            leng++;
            temp = temp.next;
        }

        int mid = (leng / 2);

        ListNode prev = null;
        temp = head;
        int i=0;
        while(i < mid){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = deleteMiddle(head);
        while(result != null){
            System.out.print(result.val+"->");
            result = result.next;
        }
        System.out.print("Null");
    }
}


