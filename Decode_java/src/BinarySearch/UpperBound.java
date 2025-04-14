package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int n=arr.length;
        int target=30;
        int low=0;
        int high=n-1;
        int up=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(target<arr[mid]){
                up=mid;
                high=mid-1;

            }
            else{
                low=mid+1;

            }
        }
        System.out.println(up);
    }
}
