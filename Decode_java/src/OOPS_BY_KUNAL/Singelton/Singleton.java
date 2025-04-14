package OOPS_BY_KUNAL.Singelton;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj=new Singleton();
        Singleton obj1=new Singleton();
    }
}
