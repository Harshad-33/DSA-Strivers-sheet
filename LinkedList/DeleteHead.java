package LinkedList;

import java.util.LinkedList;

public class DeleteHead {
    public static LinkedList<Integer> deleteHeadNode(LinkedList<Integer> head){
        if (!head.isEmpty()) {
            head.removeFirst();
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        System.out.println("before deletion : "+ head);
        System.out.println("After deletion : "+deleteHeadNode(head));
    }
}


