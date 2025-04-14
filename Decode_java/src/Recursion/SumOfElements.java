package Recursion;

public class SumOfElements {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=45;
        int x=sum(n);
        System.out.println(x);
    }
}
