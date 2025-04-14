package PatternPrinting.Triangles;

//public class ReverseTriangle {
//    public static void main(String[] args) {
//        for(int i = 1; i<=4; i++) {
//            for(int j=1; j<=4+1 -i; j++) {
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//public class ReverseTriangle {
//    public static void main(String[] args) {
//        int n=5;
//      for(int i=1;i<=n;i++){
//          for(int j=1;j<=n-i+1;j++){
//              System.out.print("*"+" ");
//          }
//          System.out.println();
//      }
//    }
//}

//Numbers reverse triangle

//public class ReverseTriangle {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class ReverseTriangle {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class ReverseTriangle {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

public class ReverseTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}




