package StackByRaghav;
import java.util.Stack;
public class PushAtBottomRecursively {
    public static void pushToBottom(Stack<Integer> st,int value){
        if(st.size()==2){
            st.push(value);
            return;
        }
        int ele=st.pop();
        pushToBottom(st,value);
        st.push(ele);
    }
        //doing it without using an extra array
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int value=6;
        System.out.println(st);
        pushToBottom(st,value);
        System.out.println(st);

    }
}
