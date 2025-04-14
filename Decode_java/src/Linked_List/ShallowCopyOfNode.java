package Linked_List;

public class ShallowCopyOfNode {
    public static void main(String[] args) {


//    Shallow copy
//        here temp has full access on a
    Node a=new Node(100);
    Node temp=a;
        System.out.println(a);
        System.out.println(temp);
        temp.val=6;
        System.out.println(a.val);

//        deep copy
        Node b=new Node(100);
        Node tempp=new Node(100);
        System.out.println(b);
        System.out.println(tempp);

}
}

