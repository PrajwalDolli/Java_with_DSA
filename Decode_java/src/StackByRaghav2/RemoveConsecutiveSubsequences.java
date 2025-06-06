package StackByRaghav2;
import java.util.Stack;
public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,7,7,7,7,1};
        int[] res=remove(arr);
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}

