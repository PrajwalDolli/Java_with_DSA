package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int target=5;
        boolean flag=false;
        int mid;
        while(high>=low){
             mid=(low+high)/2;

            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else if(target==arr[mid]){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("target found");
        }
        else{
            System.out.println("target not found");
        }
    }
}
