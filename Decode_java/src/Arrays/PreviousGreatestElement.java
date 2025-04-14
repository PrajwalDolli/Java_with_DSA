package Arrays;

public class PreviousGreatestElement {
    public static void main(String[] args) {


        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = -1;
        int pge = arr[0];
        for (int i = 1; i < n; i++){
            ans[i]=pge;
            if(arr[i]>pge){
                pge=arr[i];
            }
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
