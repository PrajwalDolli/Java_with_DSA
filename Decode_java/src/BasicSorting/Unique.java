package BasicSorting;

public class Unique {
    public static void main(String[] args) {
        int[] arr={54,11,28,47,91,63};
        int n=arr.length;
        //int[] ans=new int[arr];
        int mindx=-1;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
//        for(int i=0;i<n;i++){
//            if(arr[i]<min){
//                min=arr[i];
//                mindx=i;
//            }
//        }
        System.out.println(mindx);

    }
}
