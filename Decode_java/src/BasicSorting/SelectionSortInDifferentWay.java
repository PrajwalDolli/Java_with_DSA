package BasicSorting;

public class SelectionSortInDifferentWay {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int max=Integer.MIN_VALUE;
            int maxdx=-1;
            for(int j=i;j>=0;j--){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
