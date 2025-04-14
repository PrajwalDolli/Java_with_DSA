package Stack;

public class Stack_Using_Linked_List {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
   public static class Stack{
        int size=0;
        Node head=null;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.val;
            return x;
        }
        boolean isempty(){
            if(size==0){
                return true;
            }
            return false;
        }
        void display(Node head){
            Node temp1=head;
            while(temp1!=null){
                System.out.println(temp1.val);
                temp1=temp1.next;
            }
        }
        void displayy(Node temp){
             if(temp==null){
                  return;
               }
             displayy(temp.next);
            System.out.println( temp.val);
        }

    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.display(st.head);
        st.pop();
        st.displayy(st.head);


    }
}
