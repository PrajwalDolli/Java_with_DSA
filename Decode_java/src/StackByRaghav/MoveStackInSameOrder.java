package StackByRaghav;
import java.util.Scanner;
import java.util.Stack;
public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            int ele=sc.nextInt();
//            st.push(ele);
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
