package Linked_List;


import static Linked_List.Displaying.print;

public class ListNodeClass {
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        System.out.println(a.val);
        a.next=b;
        b.next=c;
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        print(a);

    }
}
