import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WriteEmployeeDetailes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("employee name");
        String name=sc.nextLine();

        System.out.println("employee id");
        int id=sc.nextInt();

        System.out.println("Salary");
        double salary=sc.nextDouble();

        try(PrintWriter writer=new PrintWriter("employee.txt")){
            System.out.println("empname:"+name);
            System.out.println("id:"+id);
            System.out.println("salary:"+salary);

            System.out.print("data writtern successfully");



        }
        catch(FileNotFoundException e){
            System.out.println("file cannot be write");

        }


    }}