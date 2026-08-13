import java.util.Scanner;
class Person{
    protected String name;
    protected int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    private String rollNo;
    private float marks;
    Student(String name,int age,String rollNo,float marks){
        super(name,age);
        this.rollNo=rollNo;
        this.marks=marks;

    }
    public void display(){
        System.out.print("name"+name);
        System.out.print("age"+age);
        System.out.print("roll no"+rollNo);
        System.out.print("marks"+marks);

    }

}
public class StudentRecord{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name");
        String name=sc.nextLine();
        System.out.println("enter the age");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("enter the roll No");
        String rollNo=sc.nextLine();
        System.out.print("enter the marks");
        float marks=sc.nextFloat();

        Student s=new Student(name,age,rollNo,marks);
        s.display();
    }}
