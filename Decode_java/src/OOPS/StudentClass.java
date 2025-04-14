package OOPS;

public class StudentClass {
//    public static class Student{
//        String name;
//        int rno;
//        double percent;
//    }
    public static void Arraychanges(int[] arr){
        arr[0]=9;
    }
    public static void changes(int l){
        l=7;
    }
    public static void change(Student p){
        p.name="prajwal";
    }
    public static void main(String[] args) {
        Student x=new Student();
        x.name="Raghav";
        System.out.println(x.name);
        change(x);
        System.out.println(x.name);

//        pass by value
        int l=5;
        System.out.println(l);
        changes(l);
        System.out.println(l);

//pass by reference
        int[] arr={10,2,3,4};
        System.out.println(arr[0]);
        Arraychanges(arr);
        System.out.println(arr[0]);

    }
}
