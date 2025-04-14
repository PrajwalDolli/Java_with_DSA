package StackByRaghav;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);st.push(2);
        st.push(3);st.push(4);
        System.out.println(st);
        Stack<Integer> nt = new Stack<>();
        while(st.size()>0){
            nt.push(st.pop());
        }
        Stack<Integer> pt = new Stack<>();
        while(nt.size()>0){
            pt.push(nt.pop());
        }
        while(pt.size()>0){
            st.push(pt.pop());
        }
        System.out.println(st);
    }
}
