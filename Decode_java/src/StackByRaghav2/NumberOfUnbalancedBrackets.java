package StackByRaghav2;
//import java.util.Scanner;
//import java.util.Stack;
//public class NumberOfUnbalancedBrackets {
//    public static int CountingUnBalanced(String str){
//        int count=0;
//        Stack<Character> st=new Stack<>();
//        int n=str.length();
//        for(int i=0;i<n;i++){
//            char ch=str.charAt(i);
//            if(ch=='('){
//                st.push(ch);
//            }
//            else{
//                if(st.size()==0){
//                    if(ch==')'){
//                        count++;
//                    }
//                }
//                if(st.size()!=0){
//                    if(st.peek()=='(')
//                        st.pop();
//                }
//            }
//        }
//        int l=st.size();
//        return count+l;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.println(CountingUnBalanced(str));
//    }
//}


import java.util.Scanner;
import java.util.Stack;

public class NumberOfUnbalancedBrackets {
    public static int minRemovalsToBalance(String str) {
        Stack<Character> st = new Stack<>();
        int unbalancedClosing = 0; // Count of extra closing brackets

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop(); // Balanced pair found, remove opening bracket
                } else {
                    unbalancedClosing++; // Extra closing bracket
                }
            }
        }
        // Remaining opening brackets in stack are also unbalanced
        return unbalancedClosing + st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minRemovalsToBalance(str));
    }
}
