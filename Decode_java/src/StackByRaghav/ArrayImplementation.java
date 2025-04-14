package StackByRaghav;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr=new int[5];
        private int top=-1;
        void push(int x){
            if(top+1==arr.length){
                System.out.println("stack is full");
                return;
            }
            top++;
            arr[top]=x;
        }
        int peek(){
            if(top==-1){
                System.out.println("stack underflow");
                return -1;
            }
            int ele=arr[top];
            return ele;
        }
        int pop(){
            if(top==-1){
                System.out.println("stack underflow");
                return -1;
            }
            int ele=arr[top];
            top--;
            return ele;
        }
        int size(){
            return top+1;
        }
        void display(){
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(top==-1){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(top+1==arr.length){
                return true;
            }
            return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.capacity());
    }
}
