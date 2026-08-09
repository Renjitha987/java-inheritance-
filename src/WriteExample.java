import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class WriteExample{
    public static void main(String[]args){
        try(PrintWriter writer=new PrintWriter("student.txt")){
            writer.println("Name: renjitha");
            writer.println("course: mca");
            writer.println("sem:3");

            System.out.print("data writtern successfully");
        }
        catch(FileNotFoundException e){
            System.out.println("canot write into the file");
        }
    }}