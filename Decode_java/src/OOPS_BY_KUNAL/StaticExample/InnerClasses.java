package OOPS_BY_KUNAL.StaticExample;
//

class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}
public class InnerClasses {



    public static void main(String[] args) {
        Test a = new Test( "Kunal");
        Test b = new Test( "Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}