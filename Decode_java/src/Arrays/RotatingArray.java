package Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int[] res=new int[arr.length];
        int k=9%arr.length;
        int n=arr.length;
        int l=n-k;
        for(int p=0;p<k;p++){
            res[p]=arr[l];
            l++;
        }
        int j=0;
        for(int i=k;i<n;i++){
            res[i]=arr[j];
            j++;
        }
        for(int ele:res) {
            System.out.print(ele+" ");
        }
    }
}
