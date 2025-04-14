package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        int x=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}

//public class Practice {
//    public static void main(String[] args) {
//        int[] arr = {-12, -5, -27, 8, 10, 15};
//        int mx=Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>mx){
//                mx=arr[i];
//            }
//        }
//        System.out.println(mx);
//        System.out.println(Arrays.toString(arr));
//    }
//}


//public class Practice {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int[] arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<5;i++){
//            if(arr[i]<5){
//                System.out.print(arr[i]+" ");
//            }
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//    }
//}
