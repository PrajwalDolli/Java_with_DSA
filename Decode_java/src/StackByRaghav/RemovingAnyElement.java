package StackByRaghav;

import java.util.Stack;

public class RemovingAnyElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> nt = new Stack<>();
        while(st.size() > 2) {
                nt.push(st.pop());
        }
        st.pop();
        while(nt.size()>0) {
            st.push(nt.pop());
        }
        System.out.println(st);
    }
}
