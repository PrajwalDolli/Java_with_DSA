package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,9};
        int n=arr.length;
       // int mindx=-1;
        for(int x=0;x<n-1;x++) {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for (int i = x; i < n ; i++) {
                if (arr[i] < min ){
                    min = arr[i];
                    mindx=i;

                }

            }
            int temp=arr[mindx];
            arr[mindx]=arr[x];
            arr[x]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
