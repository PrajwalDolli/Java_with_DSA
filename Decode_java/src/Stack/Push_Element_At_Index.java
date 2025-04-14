package Stack;

import java.util.Stack;

public class Push_Element_At_Index {
    public static void main(String[] args) {
        Stack<Integer> st_original=new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println(st_original);

        Stack<Integer> st_Temp=new Stack<>();
//inserting at end
//        we can use st.size is greater thean 0
//        while(!st_original.isEmpty())
//        {
//            st_Temp.push(st_original.pop());
//        }
//        st_original.push(5);
//        while(!st_Temp.isEmpty())
//        {
//            st_original.push(st_Temp.pop());
//        }
//        System.out.println(st_original);

//        inserting at any position
int pos=2;
        while(st_original.size()>=pos){
            st_Temp.push(st_original.pop());
        }
        st_original.push(5);
        while(st_Temp.size()>0){
            st_original.push(st_Temp.pop());
        }
        System.out.println(st_original);
    }
}
