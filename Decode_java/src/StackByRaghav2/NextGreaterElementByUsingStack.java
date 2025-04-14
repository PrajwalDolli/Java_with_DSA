package StackByRaghav2;
import java.util.Stack;
public class NextGreaterElementByUsingStack {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int n=arr.length;
        int[] res=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]<st.peek()){
                res[i]=st.peek();
                st.push(arr[i]);
            }
            else if(arr[i]>st.peek()){
                while(!st.isEmpty() && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i]=-1;
                    st.push(arr[i]);
                }
                else{
                    res[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
