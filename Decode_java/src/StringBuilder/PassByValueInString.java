package StringBuilder;
public class PassByValueInString {
    public static void main(String[] args) {
        String s = "raghav";
        System.out.println(s); // Output: raghav
        change(s);
        System.out.println(s); // Output: raghav (s remains unchanged)
    }
    public static void change(String s) {
        s = "madhav";
    }
}
