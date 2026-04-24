package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}

public class SearchInLL {
    public static boolean searchKey(ListNode head, int key) {
        if(head == null) return false;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(10);
        head.next.next.next.next = new ListNode(11);
        System.out.println(searchKey(head, 9));
    }
}

