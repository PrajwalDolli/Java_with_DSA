package Linked_List;

public class DeleteAtMiddle {
    public static void main(String[] args) {

        SLL list=new SLL();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
       // list.InsertAtEnd(60);
        list.display();
        System.out.println(list.head.val);
        Node slow=list.head;
        Node fast=list.head;
        Node prev=list.head;
        if(list.head.next==null){
            list.head=null;
        }
        else {
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next=slow.next;
        }
        list.display();

    }
}
