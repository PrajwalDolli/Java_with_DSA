package BinarySearch;

public class LowerBound2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int n=arr.length;
        int target=35;
        int low=0;
        int high=n-1;
        int lb=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(target<=arr[mid]){
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
