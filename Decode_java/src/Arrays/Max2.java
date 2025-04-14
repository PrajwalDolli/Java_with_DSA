package Arrays;

public class Max2 {
    public static void main(String[] args) {
        int[] arr={5,5,5,5,5};
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max2 && arr[i]<max)
                max2=arr[i];
        }
        System.out.println(max2);
    }
}

//public class Max2 {
//    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,-5};
//        int n = arr.length;
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max1) {
//                max2 = max1; // Store the previous max value
//                max1 = arr[i]; // Update max1 to the new largest value
//            }else if (arr[i] > max2 && arr[i] != max1) {
//                max2 = arr[i]; // Update max2 only if it's smaller than max1
//            }
//        }
//
//        System.out.println("Max1: " + max1);
//        System.out.println("Max2: " + (max2 == Integer.MIN_VALUE ? "No second max" : max2));
//    }
//}
