package StackByRaghav;
import java.util.Stack;
public class ReverseStackRecursively {
    public static void pushToBottom(Stack<Integer> st,int value){
        if(st.size()==0){
            st.push(value);
            return;
        }
        int ele=st.pop();
        pushToBottom(st,value);
        st.push(ele);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int ele=st.pop();
        reverseStack(st);
        pushToBottom(st,ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int value=6;
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
