package BinarySearch;

public class Find_K_Closest_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=0;
        int k=3;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int lb=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                lb=mid;
             high=mid-1;

            }
            else{
               low=mid+1;

            }
        }


        System.out.println(lb);
    }
}
