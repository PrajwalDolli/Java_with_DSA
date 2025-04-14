package OOPS_BY_KUNAL.StaticExample;


public class InnerClasses2 {
   static class Test1 {
        String name;

        public Test1(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test1 a = new Test1("Kunal");
        Test1 b = new Test1("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//if we not write static in the class Test we will get error
//because the class itself is dependent on outer class so it
//cannot produce objects

//if we write that test class outside the outer class then we
//will not get error


//important
//Now we can say that static class test is dependent on the class itself
//but not on its objects
