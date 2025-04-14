package Arrays;

public class sorting_1_0 {
    public static void main(String[] args) {
        int[] arr={0,0,1  ,0,1,1};
        int n=arr.length;
        int i=0;
        int j=n-1;
        int temp;
        while(i<j){
            if(arr[i]>arr[j]){
                 temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            else if(arr[i]==0){
                i++;
            }
            else{
                j--;
            }

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
