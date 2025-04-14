package OOPS;

public class Student_Static {
    int rno;
    String name;
     static int numberOfStudents;
    public Student_Static(){
    numberOfStudents++;
    }
    public Student_Static(int rno,String name){
        this.name=name;
        this.rno=rno;
        numberOfStudents++;
    }
}
