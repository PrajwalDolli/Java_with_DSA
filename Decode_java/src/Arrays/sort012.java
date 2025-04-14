package Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,2,2};
        int noz = 0;
        int no1 = 0;
        int no2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                noz++;
            }
            else if(arr[i]==1){
                no1++;
            }
            else{
                no2++;
            }

        }
        no1=noz+no1;
        no2=no1+no2;
        for(int i=0;i<n;i++){
            if(i<noz){
                arr[i]=0;
            }
            else if(i>=noz&&i<no1){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
//        no1=noz+no1;
//        for(int i=noz;i<no1;)
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}