package Linked_List;

public class RightMiddleOfTheLinkedList {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
        list.InsertAtEnd(60);
        System.out.println(list.head.val);
        Node slow=list.head;
        Node fast=list.head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.val);

    }
}
