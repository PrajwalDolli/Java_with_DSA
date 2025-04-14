package MultiDimensionalArrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{1,2,3}};
        int[][] b={{1,2,3},{1,2,3}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
      //  for(int[] arr:result){
//            for(int ele:arr){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }

    }
}

//public class MatrixAddition {
//    public static void main(String[] args) {
//        int[][] matrix1={{1,2,3},{1,2,3}};
//        int[][] matrix2={{1,2,3},{1,2,3}};
//        int[][] result=new int[3][3];
//        for(int i=0;i<matrix1.length;i++){
//
//            for(int j=0;j<matrix1[i].length;j++){
//                result[i][j]=matrix1[i][j]+matrix2[i][j];
//            }
//        }
//        for(int[] arr:result){
//            for(int ele:arr){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}
