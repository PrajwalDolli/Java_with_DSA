package OOPS;

public class ConstructorNew {
    public static void main(String[] args) {
        Constructor c=new Constructor(1,"prajwal",86.5);
        System.out.println(c.name);


        Constructor p=new Constructor();
        p.name="pajju";
        System.out.println(p.name);
    }
}
