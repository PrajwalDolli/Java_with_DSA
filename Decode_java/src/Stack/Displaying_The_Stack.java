package Stack;

import java.util.Stack;

public class Displaying_The_Stack {
    public static void main(String[] args) {
        Stack<Integer> st_original=new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        System.out.println(st_original);

        while(!st_original.isEmpty()){
            System.out.println(st_original.pop());
        }
    }
}
