package MultiDimensionalArrays;

public class FlippingMatrix {

    public static void main(String[] args) {
        int[][] arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
//        int[][] arr={{0,1},{1,1}};
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0){
              for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j]==0)
                      arr[i][j]=1;
                  else{
                      arr[i][j]=0;
                  }
                  //arr[i][j] = 1 - arr[i][j]; // Flip 0 -> 1 and 1 -> 0
              }
            }
        }
//checking if noz is greater then no1 if it is yes then flip that column
        for(int j=1;j<arr[0].length;j++){
            int noz=0;
            int no1=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i][j]==0){
                    noz++;
                }
            }
            no1=arr.length-noz;
            if(noz>no1){
                //then flip it
                for(int i=0;i<arr.length;i++){
                    if(arr[i][j]==0)
                        arr[i][j]=1;
                    else
                        arr[i][j]=0;
                }
            }
        }
        for(int[] a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int rowValue=0;
            int a=0;
            for(int j=arr[i].length-1;j>=0;j--){

                rowValue= (int) (rowValue+arr[i][j]*Math.pow(2,a));
//                rowValue = rowValue * 2 + arr[i][j];
                a++;
            }
            sum+=rowValue;
        }
        System.out.println(sum);
    }
}
