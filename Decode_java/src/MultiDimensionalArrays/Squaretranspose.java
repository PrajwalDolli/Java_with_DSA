package MultiDimensionalArrays;

public class Squaretranspose {
    public static void main(String[] args) {
        int[][] a={{1,1,1},{2,2,2},{3,3,3}};
        //int[][] b=new int[3][2];
        //int[][] b={{1,2,3},{1,2,3}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=a[j][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<2;j++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
