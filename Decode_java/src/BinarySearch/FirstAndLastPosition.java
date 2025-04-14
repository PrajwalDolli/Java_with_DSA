package BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;

        int n=arr.length;
        int low=0;
        int high=n-1;
        int target=8;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]){
                flag=true;
                break;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
        }
        if(flag==false){

            System.out.println("not present");
        }
        else {


            int up = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target < arr[mid]) {
                    up = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[1] = up-1;

            low = 0;
            high = n - 1;
            int lb = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target <= arr[mid]) {
                    lb = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int fp = lb;
//        System.out.println(lp);
//        System.out.println(fp);
            ans[0] = fp;

            for (int ele : ans) {
                System.out.println(ele);
            }
        }
    }
}
