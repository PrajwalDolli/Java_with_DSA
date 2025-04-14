package StackByRaghav;
import java.util.Stack;
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        //if u want to access or displat 3rd element
        while(st.size()>3){
           st.pop();
        }
        System.out.println(st.peek());
    }
}
