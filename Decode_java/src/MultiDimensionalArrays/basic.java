package MultiDimensionalArrays;

public class basic {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{1,2,3}};
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }

        }
    }
}
