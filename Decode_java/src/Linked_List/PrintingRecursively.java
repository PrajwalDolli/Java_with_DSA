package Linked_List;

public class PrintingRecursively {
    public static void Print_Recursive(Node temp){
        if(temp==null)return;
        System.out.print(temp.val+" ");
        Print_Recursive(temp.next);
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
        Print_Recursive(temp);

    }
}
