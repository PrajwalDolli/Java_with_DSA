package PatternPrinting.Triangles;

//public class StarTriangle {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i%2==1) {
//                    System.out.print(j + " ");
//                } else {
//                    System.out.print((char) (j + 64) + " ");
//                }
//            }
//
//            System.out.println();
//        }
//    }
//}

//public class StarTriangle {
//    public static void main(String[] args) {
//       for(int i=1;i<=4;i++){
//           for(int j=1;j<=i;j++){
//               System.out.print("*"+" ");
//           }
//           System.out.println();
//       }
//    }
//}

//public class StarTriangle{
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class StarTriangle{
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class StarTriangle{
//    public static void main(String[] args) {
//        for(int i=1;i<=26;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

public class StarTriangle{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for (int j = 1; j <= i; j++) {
                    if (i % 2 != 0) {
                        System.out.print(j + " ");
                    }
                    else{
                        System.out.print((char)(j+64)+" ");
                    }
                }
            System.out.println();

        }
    }
}





