package Recursion;

public class ArrayTraversal {
    public static void print(int i,int[] arr){

        if(i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr={4,5,3,6,7,8,9};
        print(0,arr);
    }
}
