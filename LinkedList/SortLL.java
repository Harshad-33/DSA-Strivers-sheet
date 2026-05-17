package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SortLL {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        ListNode list1 = sortList(left);
        ListNode list2 = sortList(right);

        return mergeTwoSortedLL(list1 , list2);
    }
        public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeTwoSortedLL(ListNode list1 , ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = null;
        ListNode tail = null;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                if(head == null){
                    head = list1;
                    tail = list1;
                }else{
                    tail.next = list1;
                    tail = tail.next;
                }
                list1 = list1.next;
            }else{
                if(head == null){
                    head = list2;
                    tail = list2;
                }else{
                    tail.next = list2;
                    tail = tail.next;
                }
                list2 = list2.next;
            }
        }
        if(list1 == null){
            tail.next = list2;
        }
        if(list2 == null){
            tail.next = list1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode result = sortList(head);
        while(result != null){
            System.out.print(result.val+"->");
            result = result.next;
        }
        System.out.print("Null");
    }
}

// Output :-
// 1->2->3->4->Null
