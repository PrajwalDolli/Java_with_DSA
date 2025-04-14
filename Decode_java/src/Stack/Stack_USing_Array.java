package Stack;
 class Stack{
    int[] arr=new int[5];
    int top=-1;
    int size=0;
    public void push(int ele){
        if(isfull()){
            System.out.println("stack is full");
            return;
        }
        top++;
        arr[top]=ele;
        size++;
    }
    public int pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }
        int ele=arr[top];
        top--;
        size--;
        return ele;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean isempty(){
        if(size==0){
            return true;
        }
       return false;
    }
     public boolean isfull(){
         if(size==arr.length){
             return true;
         }
         return false;
     }
     public int peek(){
        if(size==0){
            System.out.println("stack is empty");
            return -1;
        }
         return arr[top];
     }

}
public class Stack_USing_Array {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(2);
        st.display();
        st.isempty();
        System.out.println(st.isfull());
        int element = st.peek();
        System.out.println(element);
        st.display();

    }
}
