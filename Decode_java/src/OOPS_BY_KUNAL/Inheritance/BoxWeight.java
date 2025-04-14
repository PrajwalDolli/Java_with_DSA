package OOPS_BY_KUNAL.Inheritance;

public class BoxWeight extends Box{
    double weight;

    // 1 related problem
    public BoxWeight() {
        this.weight = -1;
    }

   // another type of constructor where reference type is Box
    //so it only accesses the members of Box only becs reference type is Box
    //bcs super invokes the constructot of Box constructor > thinkkkkk
   BoxWeight (BoxWeight other) {
       super(other);
       weight = other.weight;
   }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? calls the parent class constructor
        //used to initialize values present in parent class
//        when you make l as private ,when you call super you will
//        not get error bcs here Box constructor been called

        this.weight = weight;
    }
}
