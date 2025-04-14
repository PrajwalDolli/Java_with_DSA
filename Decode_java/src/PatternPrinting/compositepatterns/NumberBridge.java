package PatternPrinting.compositepatterns;

public class NumberBridge {
    public static void main(String[] args) {
        int n=3;

        for (int i=1;i<=(2*n-1); i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int a=(2*n-1)/2;
        for(int i=1;i<=n-1;i++){

            for (int j = 1; j<=(n-i); j++) {
                System.out.print(j+" ");
            }
            for (int j=1;j<=(2*i-1);j++) {
                System.out.print("_ ");
            }
            for (int j=a+i+1; j<=2*n-1; j++) {
                System.out.print(j+" ");
            }


            System.out.println();
        }
    }
}
