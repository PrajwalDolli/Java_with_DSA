package OOPS;

public class Student_StaticNew {
    public static void main(String[] args) {
        Student_Static s1=new Student_Static(1,"pajju");
        System.out.println(s1.numberOfStudents);
        Student_Static s2=new Student_Static(2,"pajju");
        System.out.println(s2.numberOfStudents);
        Student_Static s3=new Student_Static();
        System.out.println(s3.numberOfStudents);

        Student_Static s4=new Student_Static();
        Student_Static s5=new Student_Static();
        Student_Static s6=new Student_Static();
        System.out.println(s4.numberOfStudents);
        System.out.println(s5.numberOfStudents);
        System.out.println(s6.numberOfStudents);




    }
}
