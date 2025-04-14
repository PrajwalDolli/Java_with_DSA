package StackByRaghav2;
import java.util.Stack;
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        int n=arr.length;
        ans[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            int k=st.peek();
            if(arr[i]<arr[k]){
                st.push(i);
                ans[i]=i-k;
            }
            if(arr[i]>arr[k]){
                while(!st.isEmpty() && arr[i]>arr[k]){
                    st.pop();
                    k=st.peek();
                }
                ans[i]=i-st.peek();
                st.push(i);
            }
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
