package Recursion;

public class Stair2 {
    public static int stair(int n){
        if(n==2){
            return n;
        }
        if(n==1||n==0){
            return n;
        }
        return stair(n-1)+stair(n-3);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=stair(n);
        System.out.println(ans);
    }
}
