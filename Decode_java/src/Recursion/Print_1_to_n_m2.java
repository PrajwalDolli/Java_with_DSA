package Recursion;

public class Print_1_to_n_m2 {
    public static void print(int x,int n){
        if(x==n){
            System.out.print(x);
            return;
        }
        System.out.print(x+" ");
        print(x+1,n);
    }
    public static void main(String[] args) {
        int n=20;
        print(1,n);
    }
}
