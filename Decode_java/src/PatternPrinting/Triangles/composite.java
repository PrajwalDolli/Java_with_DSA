package PatternPrinting.Triangles;

public class composite {
    public static void main(String[] args) {
        int n=5;
        int a;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

              if(i+j>n)
              {
                  a=i;
                  System.out.print(a--+" ");
              }
              else{
                  System.out.print("  ");
              }
            }

            System.out.println();
        }
    }
}
