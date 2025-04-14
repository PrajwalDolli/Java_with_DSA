package Stack;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
//        System.out.print(top+" ");
        reverse(st);
//        st.push(top);
        System.out.print(top+" ");

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverse(st);


    }
}
