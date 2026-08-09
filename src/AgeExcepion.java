import java.util.InputMismatchException;
import java.util.Scanner;
public class AgeExcepion{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.print("enter the age");
            int age=sc.nextInt();
            System.out.println("age:"+age);
        }
        catch(InputMismatchException e){
            System.out.print("enter the valid age");
        }
    }
}