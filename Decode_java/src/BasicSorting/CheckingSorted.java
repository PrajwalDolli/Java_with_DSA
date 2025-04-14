package BasicSorting;

public class CheckingSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,1};
        int n =arr.length;

        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println(flag);
    }
}
