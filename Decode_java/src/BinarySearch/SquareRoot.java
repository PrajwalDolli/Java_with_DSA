package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int x=16;
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int root=0;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)==x){
                root=mid;
                break;
            }
            else if(mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}
