package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LLCycle2 {
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        ListNode result = detectCycle(head);
        if(result != null) {
            System.out.println("starting node is : "+result.val);
        }else{
            System.out.println("no cycle");
        }
    }
}
