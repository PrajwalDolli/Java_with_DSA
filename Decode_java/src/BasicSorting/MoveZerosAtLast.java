package BasicSorting;

public class MoveZerosAtLast {
    public static void main(String[] args) {


        int[] arr = {0, 0, 0, 3, 0, 4};
        int noz=0;
        for(int ele:arr){
            if(ele==0){
                noz++;
            }
        }
        int n = arr.length;
        for (int j = 0; j <noz; j++) {

            for (int i = 0; i < n - 1-j; i++) {
                if (arr[i] == 0) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}