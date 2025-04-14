package AdvancedSorting;

public class MergeSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[] arr1,int[] arr2,int[] ans){
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }

    }
    public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1)return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int j=0;j<n-n/2;j++){
            b[j]=arr[j+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
        a=null;
        b=null;

    }
    public static void main(String[] args) {
        int[] arr={80,10,70,30,60,40,50,20};
        mergesort(arr);
        print(arr);

    }
}
