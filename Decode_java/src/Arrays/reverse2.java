package Arrays;

import java.util.Arrays;

public class reverse2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int i=0;
        int j=arr.length-1;
        while(j>=i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
