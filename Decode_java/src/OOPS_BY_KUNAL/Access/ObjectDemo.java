package OOPS_BY_KUNAL.Access;

public class ObjectDemo {
    int num;

//    Alresdy covered these 2 below
    public ObjectDemo(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }



//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
   // if it returns num
public int hashCode() {
     return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj1 = new ObjectDemo(34);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
    //here hashcode means unique representation of object via a unique number
//it is not a address it is random integer value via using sum algorithm
//here actually we aare finding uniqueness of an object
}
