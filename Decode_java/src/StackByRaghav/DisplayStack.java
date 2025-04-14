package StackByRaghav;
import java.util.Stack;
public class DisplayStack {
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int ele=st.pop();
        System.out.print(ele+" ");
        displayReverse(st);
        st.push(ele);
    }
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()<=0){
            return;
        }
        int ele=st.pop();
        displayRecursively(st);
        System.out.print(ele+" ");
        st.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        displayReverse(st);
        System.out.println();
        displayRecursively(st);
        System.out.println();
//with the help of another stack
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        while(temp.size()>0){
            System.out.print(temp.peek()+" ");
        }
        System.out.println();
        //with the help of arrays
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }


    }
}
