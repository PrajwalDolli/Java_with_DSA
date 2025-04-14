package Arrays;

public class ducthFlagAlgorithm {
    public static void main(String[] args) {
            int[] arr={0,1,2,0,1,2,0,1,2,0};
            int n=arr.length;
            int low=0;
            int mid=0;
            int high=n-1;
            int temp;
            while(mid<=high){
                if(arr[mid]==0){
                    //swap(arr[mid],arr[low]);
                   temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    mid++;
                    low++;
                }
                else if(arr[mid]==1){
                    mid++;
                }
                else{
                    //swap(arr[mid],arr[high]);
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                        high--;

                }
            }
            for(int ele:arr){
                System.out.print(ele+" ");
            }

    }
}
