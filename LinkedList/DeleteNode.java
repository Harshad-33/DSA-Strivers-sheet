package LinkedList;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNode {
    public static void deleteNode(ListNode node){
        if(node == null || node.next == null){
            return ;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        deleteNode(head.next);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

