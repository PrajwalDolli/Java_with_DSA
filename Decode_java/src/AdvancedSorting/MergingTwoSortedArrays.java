package AdvancedSorting;

public class MergingTwoSortedArrays {
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
    public static void main(String[] args) {
        int[] arr1={10,30,50,70,90,100};
        int[] arr2={10,40,60,80};
        int[] ans=new int[arr1.length+arr2.length];
        merge(arr1,arr2,ans);
        print(ans);
    }
}
