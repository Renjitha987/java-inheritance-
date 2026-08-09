import java.util.InputMismatchException;
import java.util.Scanner;
public class ageExceptionNegative{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("enter the age");
            int age=sc.nextInt();
            if (age<0){
                throw new IllegalArgumentException("age cannot be negative");
            }
            System.out.print("age:"+age);

        }
        catch(InputMismatchException e){
            System.out.println("enter the valid number");
        }
        catch(IllegalArgumentException e){
            System.out.print("cannot be -ve");

        }
    }}