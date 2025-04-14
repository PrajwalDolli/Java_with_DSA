package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(n);
        int j=n-1;
        for(int i=0;i<n/2;i++){
            //int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
