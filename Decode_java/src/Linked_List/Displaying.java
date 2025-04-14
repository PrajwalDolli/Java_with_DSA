package Linked_List;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class Displaying {

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
//        for(int i=1;i<=4;i++){
//            System.out.print(temp.val+" ");
//            temp=temp.next;
//        }
//        sometimes they will not give us the size of the array
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
       print(a);
    }
}
