package PatternPrinting.Triangles;

//public class flipped {
//    public static void main(String[] args) {
//        int a=5;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                if(j<a){
//                    System.out.print("0 ");
//                }
//                else{
//                    System.out.print("* ");
//                }
//
//            }
//            a--;
//            System.out.println();
//        }
//    }
//}

//Another method

public class flipped {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
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
