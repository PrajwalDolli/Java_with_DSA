package practice;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x); // Output: 5
        change(x);
        System.out.println(x); // Output: 5 (x remains unchanged)
    }

    public static void change(int x) {
        x = 10;
    }
}
