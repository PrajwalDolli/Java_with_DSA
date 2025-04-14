package Recursion;

public class Print_1_to_n {
    static int n=20;
    public static void print(int x){
        if(x==n){
            System.out.print(x);
            return;
        }
        System.out.print(x+" ");
        print(x+1);
    }
    public static void main(String[] args) {
       // int n=20;
        print(1);
    }
}
