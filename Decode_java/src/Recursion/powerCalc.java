package Recursion;

public class powerCalc {
    public static int power(int a,int b){
        if(a==0&&b==0){
            System.out.println("not defined");
            return -1;
        }
        if(b==0)return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        int a=3;
        int b=7;
//        if(a==0 && b==0){
//            System.out.println("not defined");
//            return;
//        }
//        double ans=Math.pow(a,b);
//        System.out.println(ans);
        int res=power(a,b);
        System.out.println(res);
        //System.out.println(power(a,b));


    }
}
