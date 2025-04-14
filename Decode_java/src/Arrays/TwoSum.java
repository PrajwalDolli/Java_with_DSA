package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=7;
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }

        }
    }
}
