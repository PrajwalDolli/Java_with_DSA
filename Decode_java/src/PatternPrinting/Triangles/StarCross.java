package PatternPrinting.Triangles;

public class StarCross {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int mid=(5+1)/2;
                if((i==j)||(i+j==5+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
