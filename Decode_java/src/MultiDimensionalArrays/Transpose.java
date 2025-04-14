package MultiDimensionalArrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{1,2,3}};
        int[][] b=new int[3][2];
        //int[][] b={{1,2,3},{1,2,3}};

        //Only printing
            for(int j=0;j<3;j++){
                for(int i=0;i<2;i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            }
        System.out.println();

            //Storing and printing
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
