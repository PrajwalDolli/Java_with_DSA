package StackByRaghav;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayRecursive(Node head){
            if(head==null){
                return;
            }
            displayRecursive(head.next);
            System.out.print(head.val+" ");
        }
        void display(){
            displayRecursive(head);
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack underflow");
                return -1;
            }
            int ele=head.val;
            head=head.next;
            size--;
            return ele;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack underflow");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        System.out.println(st.isEmpty());
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.displayRev();
        System.out.println(st.peek());
        st.pop();
        st.displayRev();
        System.out.println(st.size());
        st.display();
    }
}
