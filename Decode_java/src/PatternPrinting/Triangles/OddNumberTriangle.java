package PatternPrinting.Triangles;

public class OddNumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
