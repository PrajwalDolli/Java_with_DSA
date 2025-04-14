package Arrays;

public class RotatingArray2 {
    public static void reverse(int[] arr,int i,int j){
        while(j>=i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int k=3;
        int j=n-k-1;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}
