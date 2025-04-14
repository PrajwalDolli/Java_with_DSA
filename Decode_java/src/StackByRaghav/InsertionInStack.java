package StackByRaghav;
import java.util.Stack;
public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx=3;
        Stack<Integer> nt = new Stack<>();
        while(st.size()>idx){
            nt.push(st.pop());
        }
        st.push(19);
        while(nt.size()>0){
            st.push(nt.pop());
        }
        System.out.println(st);
    }
}
