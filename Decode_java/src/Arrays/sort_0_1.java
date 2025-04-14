package Arrays;

public class sort_0_1 {
    public static void main(String[] args) {
        int no_Of_Ones=0;
        int no_Of_zeros=0;
        int[] arr={0,1,1,0,0,1,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                no_Of_zeros++;
            }
        }
        no_Of_Ones=n-no_Of_zeros;
        for(int i=0;i<no_Of_zeros;i++){
            arr[i]=0;
        }
        for(int i=no_Of_zeros;i<n;i++){
            arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
