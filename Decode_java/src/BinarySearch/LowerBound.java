package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int Target=5;
        int lb=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[high]<Target){
                    lb=high+1;
                    break;
            }
            else if(arr[low]>Target){
                lb=low;
                break;
            }

            else if(arr[mid]<Target){
                lb=high;
                low=mid+1;
            }
            else if(arr[mid]>Target){
                lb=high;
                high=mid-1;

            }
            else if(arr[mid]==Target){
                for(int i=mid;i>=0;i--){
                    if(arr[i]==Target){
                        lb=i;
                    }
                }
                System.out.println("target found");
                break;
            }
            else if(low==high){
                lb=high;
            }

        }
        System.out.println("lower bound:"+lb);
    }
}
