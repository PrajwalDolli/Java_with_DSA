package Recursion;

public class PowerCalc2 {
    public static int pow(int a,int b){

        if(a==0 && b==0){
            System.out.println("not defined");
            return -1;
        }
        if(b==0){
            return 1;
        }
        int ans=pow(a,b/2);
        if(b%2==0){
            return ans*ans;
        }
        return ans*ans*2;
    }
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int ans=pow(a,b);
        System.out.println(ans);
    }
}
