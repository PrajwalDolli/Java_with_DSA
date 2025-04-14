public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        modifyString(str);
        System.out.println(str);  // Output: Hello (unchanged)
    }

    public static void modifyString(String s) {
        System.out.println(s);
        s = s+"World"; // This only changes the local copy, not the original
    }
}

