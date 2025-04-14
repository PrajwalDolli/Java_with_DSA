package Linked_List;
class SLL{//user defined data structure
    Node head;
    Node tail;
    int size;
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    void InsertAtFront(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void InsertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
              tail.next=temp;
              tail=temp;
        }
        size++;

    }
    void Insert(int idx,int val ){
        if(idx==0){
            InsertAtFront(val);
            return;
        }
        if(idx==size){
            InsertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid index");
            return;
        }
        Node k=head;
        Node temp=new Node(val);

        int i=0;
        while(idx-1>i){
            k=k.next;
            i++;
        }
//        for(int i=1;i<=idx-1;i++){
//            k=k.next;
//        }

        temp.next=k.next;
        k.next=temp;
        size++;
    }
    public int get  (int idx) throws Error{
        if(idx==size-1){
            return tail.val;
        }
        if(idx>=size||idx<0){
            throw new Error("Invalid input");

        }
        Node x=head;
        for(int i=0;i<=idx-1;i++){
            x=x.next;
        }
        return x.val;

    }
    public void set(int idx,int val) throws Error{
        if(idx==size-1){
             tail.val=val;
        }
        if(idx>=size||idx<0){
            throw new Error("Invalid input");

        }
        Node x=head;
        for(int i=0;i<=idx-1;i++){
            x=x.next;
        }
         x.val=val;

    }
    void deleteAtHead() throws Error{
        if(head==null)throw new Error("list is empty");
        head=head.next;
        size--;
    }
    void deleteAtTail() throws Error{
        if(head==null)throw new Error("list is empty");
        head=head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(head==null)throw new Error("List is empty");
        if(idx<0||idx>=size){
            throw new Error("Invalid Input");
        }

        Node temp=head;
        Node prev=null;
        if(idx==0){
           deleteAtHead();
           return;
        }



            for(int i=0;i<idx-1;i++){
                //prev=temp;
                temp=temp.next;
            }
            if(temp.next==tail)tail=temp;
           // prev.next=temp.next;
            temp.next=temp.next.next;
            size--;


    }
    void size(){
        System.out.println("length of linked list is "+size);
    }
}

public class ImplementationLL {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtFront(5);
        list.display();

        list.size();
        list.Insert(2,100);
        list.display();
        list.size();
        list.Insert(10,200);
        list.display();
        System.out.println(list.get(1));
        list.display();
        list.set(1,200);
        list.display();
        list.delete(2);
        list.display();


    }
}
