package BasicSorting;

public class FindMajoritylement {
    public static void main(String[] args) {


        int[] arr = {1,1,1,1,2,3,4};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                }
            if (flag == true) {
                break;
            }
        }
        for(int ele:arr){
            System.out.print(ele);
        }
        System.out.println();
        int a = n / 2;
        System.out.print(arr[a]);
       // return arr[a];
    }
}