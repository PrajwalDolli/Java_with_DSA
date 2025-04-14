package OOPS;

public class Sliding {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int n=arr.length;
        int k=4;
        int[] ans=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=i;j<k+i;j++){
                if (arr[j] > max) {
                    max=arr[j];
                }
            }
            ans[i]=max;
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
