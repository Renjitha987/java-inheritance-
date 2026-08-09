import java.util.InputMismatchException;
import java.util.Scanner;
public class InputValid{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int age;
        while(true){
            try{
                System.out.print("enter the age");
                age=sc.nextInt();
                System.out.print("age:"+age);
                break;
            }

            catch(InputMismatchException e){
                System.out.print("invalid input valid integer");
                sc.next();
            }
        }
        System.out.println("you entered:"+age);

    }}