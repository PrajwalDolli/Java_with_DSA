package StackByRaghav3;
import java.util.Stack;
public class InfixToPrefix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        Stack<String> val= new Stack<>();
        Stack<Character> op= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            //val.push(String.valueOf(ascii - 48)); you can use this or below what we have written

            if(ascii>=48 && ascii<=57)val.push(ch+"");
            else if(op.size()==0 || ch=='('||op.peek()=='(')op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String val2=val.pop();
                    String val1=val.pop();
                    char o=op.pop();
                    String t=o+val1+val2;
                    val.push(t);
                }
                op.pop();//'('removed
            }
            else{
                if(ch=='+'||ch=='-'){
                    String val2=val.pop();
                    String val1=val.pop();
                    char o=op.pop();
                    String t=o+val1+val2;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=op.pop();
                        String t=o+val1+val2;
                        val.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String val2=val.pop();
            String val1=val.pop();
            char o=op.pop();
            String t=o+val1+val2;
            val.push(t);

        }
        System.out.println(val.peek());
    }
}

