package OOPS_BY_KUNAL.StaticExample;

public class Main {
    public static void main(String[] args) {


//        Human kunal = new Human( 22,  "Kunal", 10000,  false);
//        Human rahul = new Human( 34, "Rahul",  15000, true);
//        Human arpit = new Human( 34, "arpit", 15000,  true);
//
////        System.out.println(kunal.population);
////        System.out.println(rahul.population);
////        System.out.println(arpit.population);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
////        use like this because it is convention

        Main a=new Main();
        a.greeting();
        fun();

//        greeting();

    }
//    so it does not belongs to an instance
    // this is not dependent on objects
    static void fun() {
       // greeting();//you cant use this because it requires an instance
        //but the functio you are using does not dependent on objects
    }

//    it belongs to instance
    // we know that something which is not static, belongs to an object
   void greeting() {
        System.out.println("Hello world");
    }
//    without specifying which instance it belongs to you cannot use it in fun() method
}
