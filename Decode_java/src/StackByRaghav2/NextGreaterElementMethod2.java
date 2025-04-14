package StackByRaghav2;
import java.util.Stack;
public class NextGreaterElementMethod2 {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] res=new int[arr.length];
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else if(arr[i]>arr[st.peek()]){
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    res[st.peek()]=arr[i];
                    st.pop();
                }
                st.push(i);
            }
            else if(arr[i]<arr[st.peek()]){
                st.push(i);
            }
        }
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
