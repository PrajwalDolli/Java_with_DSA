package Stack;

import java.util.Stack;

public class copying_A_Stack {
    public static void main(String[] args) {
        Stack<Integer> st_original=new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println(st_original.peek());
        System.out.println(st_original);
        Stack<Integer> st_Temp=new Stack<>();

        while(!st_original.isEmpty())
        {
            st_Temp.push(st_original.pop());
        }
        System.out.println(st_Temp);
        Stack<Integer> st_final=new Stack<>();
        while(!st_Temp.isEmpty())
        {
            st_final.push(st_Temp.pop());
        }

        System.out.println(st_final);


    }
}
